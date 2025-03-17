package org.example.entity;

import org.example.entity.constant.Color;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
  String name;
  Color color;

}
