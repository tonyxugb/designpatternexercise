package observer.weatherstationcustom;

/**
 * @Description:观察者接口
 * @Author:tony
 * @Since:2015年9月9日
 */
public interface Observer {
	/**
	 * @Description:当气象观测值变化时，主题会把这些状态值当做方法的参数，传递给观察者
	 * @Author:tony
	 * @Since:2015年9月9日
	 * @param temp 气温
	 * @param humidity 湿度
	 * @param pressure 气压
	 */
	void update(float temp, float humidity, float pressure);
}
