package org.example.baba.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.*;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@EqualsAndHashCode
@RedisHash(value = "ApprovalCode", timeToLive = 600)
@ToString
public class ApprovalCode implements Serializable {

  @Id String approvalKey;

  String email;
}
