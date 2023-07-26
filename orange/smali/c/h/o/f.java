public abstract class c.h.o.f {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Float a ( android.widget.EdgeEffect p0 ) {
		 /* .locals 0 */
		 /* .line 5 */
		 try { // :try_start_0
			 p0 = 			 (( android.widget.EdgeEffect ) p0 ).getDistance ( ); // invoke-virtual {p0}, Landroid/widget/EdgeEffect;->getDistance()F
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* :catchall_0 */
			 int p0 = 0; // const/4 p0, 0x0
		 } // .end method
		 public static Float a ( android.widget.EdgeEffect p0, Float p1, Float p2 ) {
			 /* .locals 0 */
			 /* .line 3 */
			 try { // :try_start_0
				 p0 = 				 (( android.widget.EdgeEffect ) p0 ).onPullDistance ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->onPullDistance(FF)F
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 4 */
				 /* :catchall_0 */
				 (( android.widget.EdgeEffect ) p0 ).onPull ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->onPull(FF)V
				 int p0 = 0; // const/4 p0, 0x0
			 } // .end method
			 public static android.widget.EdgeEffect a ( android.content.Context p0, android.util.AttributeSet p1 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 try { // :try_start_0
					 /* new-instance v0, Landroid/widget/EdgeEffect; */
					 /* invoke-direct {v0, p0, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 2 */
					 /* :catchall_0 */
					 /* new-instance p1, Landroid/widget/EdgeEffect; */
					 /* invoke-direct {p1, p0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V */
				 } // .end method
