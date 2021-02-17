package xyz.wendoxd.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class PositionsHelper {
	public static ArrayList<Place> places = Lists.newArrayList();

	public static void init() {
		big.clear();
		safezone.clear();
		shaxta.clear();
		cherno.clear();
		big.add(new Place(-1770, 72, -1672));
		big.add(new Place(-1707, 72, -1604));
		big.add(new Place(-1788, 73, -1511));
		big.add(new Place(-1563, 86, -1798));
		big.add(new Place(-1587, 72, -1885));
		safezone.add(new Place(7, 101, -1));
		safezone.add(new Place(0, 67, -227));
		shaxta.add(new Place(2473, 67, -1084));
		shaxta.add(new Place(2450, 74, -1116));
		shaxta.add(new Place(2434, 61, -1124));
		cherno.add(new Place(-732, 65, 3140));
		cherno.add(new Place(-750, 65, 2856));
		cherno.add(new Place(-332, 65, 2673));
	}

	public static boolean checkHousePlace() {
		boolean canPlace = true;
		return canPlace;
	}

	public static ArrayList<Place> big = Lists.newArrayList();
	public static ArrayList<Place> shaxta = Lists.newArrayList();
	public static ArrayList<Place> safezone = Lists.newArrayList();
	public static ArrayList<Place> cherno = Lists.newArrayList();

	public static <T> T getRandom(ArrayList<T> arrays) {
		return arrays.get(new Random().nextInt(arrays.size()));
	}

	public static class Place {
		public int x;
		public int y;
		public int z;

		public Place(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
			places.add(this);
		}
	}
}
