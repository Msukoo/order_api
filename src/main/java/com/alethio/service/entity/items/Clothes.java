package com.alethio.service.entity.items;

import com.alethio.service.entity.Order;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@DiscriminatorValue("C")
public class Clothes extends Item {



}
