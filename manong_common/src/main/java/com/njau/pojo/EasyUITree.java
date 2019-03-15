package com.njau.pojo;

/**
 * @author 张文军
 * @Description:用来数据列表展示
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/3/1514:36
 */
public class EasyUITree {

		/**
		 * 节点的 id，它对于加载远程数据很重要。
		 */
		private int id;
		/**
		 * 要显示的节点文本。
		 */
		private String text;
		/**
		 * 节点状态，'open' 或 'closed'，默认是 'open'。当设置为 'closed' 时，该节点有子节点，并且将从远程站点加载它们
		 */
		private String state;

		public int getId() {
				return id;
		}

		public void setId(int id) {
				this.id = id;
		}

		public String getText() {
				return text;
		}

		public void setText(String text) {
				this.text = text;
		}

		public String getState() {
				return state;
		}

		public void setState(String state) {
				this.state = state;
		}
}
