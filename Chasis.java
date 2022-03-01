package pro.feb.composicion;

import java.util.Objects;

public class Chasis {

	private Integer codigoChasis;
	private String color;
	private String material;

	@Override
	public int hashCode() {
		return Objects.hash(codigoChasis);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		Chasis other = (Chasis) obj;
		
		if (this == obj)
			sonIguales = true;
		
		else if(obj!=null){
			sonIguales = this.codigoChasis.equals(other.codigoChasis)
					&& this.color.equals(other.color);
			
		}
		
		return sonIguales;
	}
	
	
}
