import java.util.EventListener;


public interface DetailListener extends EventListener {
	public void detailsEventOccured(DetailEvent event);
}
