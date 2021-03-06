/*
 *
 * Copyright 2020 HuiFer All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.huifer.view.redis.sample.boot;

import java.util.List;

import com.github.huifer.view.redis.boot.ann.EnableViewRedis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.geo.Point;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
@EnableViewRedis
public class Application {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	}

	@Bean
	public ApplicationRunner rc() {
		return args -> {
			redisTemplate.opsForValue().set("1", "2");
//			redisTemplate.opsForGeo().add("ppp", new Point(1.0, 10.0), "aaa");
			List<Point> ppp = redisTemplate.opsForGeo().position("ppp", "aaa");
			System.out.println();
		};
	}

}
