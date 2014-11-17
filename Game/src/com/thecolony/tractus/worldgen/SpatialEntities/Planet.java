package com.thecolony.tractus.worldgen.SpatialEntities;

import com.jme3.asset.AssetManager;
import com.jme3.scene.Spatial;
import com.thecolony.tractus.worldgen.resources.Res;

/**
 * Created by chthonic7 on 10/8/14.
 */
public class Planet extends Territory {
    private int ID;
    private static int ID_COUNT=0;
    private final double MASS;
    private final double RADIUS;
    private PlanetType type;
    protected Continent[] continents;
    private Spatial model;
    private AssetManager manager;
    //TODO: INSERT ATMO CONDITIONS(not likely to ever happen, though)
    public Planet(float locationX, float locationZ, PlanetType type, Spatial model, Star star, Continent[] continents, Res res, String name, String owner){
        super(locationX,locationZ,star,continents,res,name,owner);
        this.type=type;
        MASS=1;
        RADIUS=1;
        this.model=model;
        this.ID_COUNT++;
        this.ID=ID_COUNT;
        //TODO: previous two are determined by planet type
    }

    public PlanetType getType() {
        return type;
    }

    public void setType(PlanetType type) {
        this.type=type;
    }

    public double getMass() {
        return MASS;
    }

    public double getRadius() {
        return RADIUS;
    }

    @Override
    public int getID() {
        return ID;
    }

    public String toString(){
        return superTerr.toString()+" Planet="+name+super.toString();
    }
}
