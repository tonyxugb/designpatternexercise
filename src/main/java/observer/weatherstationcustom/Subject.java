package observer.weatherstationcustom;

/**
 *@Description:主题接口
 *@Author:tony
 *@Since:2015年9月9日
 */
public interface Subject {
	
	/**
	 * @Description:注册观察者
	 * @Author:tony
	 * @Since:2015年9月9日
	 * @param o
	 */
	void registerObserver(Observer o);
	
	/**
	 * @Description:移除观察者
	 * @Author:tony
	 * @Since:2015年9月9日
	 * @param o
	 */
	void removeObserver(Observer o);
	
	/**
	 * @Description:当主题改变时，这个方法会被调用，以通知所有的观察者
	 * @Author:tony
	 * @Since:2015年9月9日
	 */
	void notifyObservers();
}
