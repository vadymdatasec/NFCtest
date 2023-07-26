public class org.apache.log4j.lf5.viewer.TrackingAdjustmentListener implements java.awt.event.AdjustmentListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Integer a;
	 /* # direct methods */
	 public org.apache.log4j.lf5.viewer.TrackingAdjustmentListener ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener;->a:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void adjustmentValueChanged ( java.awt.event.AdjustmentEvent p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( java.awt.event.AdjustmentEvent ) p1 ).getAdjustable ( ); // invoke-virtual {p1}, Ljava/awt/event/AdjustmentEvent;->getAdjustable()Ljava/awt/Adjustable;
		 v0 = 		 /* .line 2 */
		 v1 = 		 /* .line 3 */
		 /* iget v2, p0, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener;->a:I */
		 /* if-ne v1, v2, :cond_0 */
		 return;
		 /* .line 4 */
	 v2 = 	 v1 = 	 } // :cond_0
	 /* add-int/2addr v1, v2 */
	 v2 = 	 /* .line 5 */
	 /* add-int/2addr v1, v2 */
	 /* iget v2, p0, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener;->a:I */
	 /* if-lt v1, v2, :cond_1 */
	 v1 = 	 /* .line 6 */
	 /* .line 7 */
} // :cond_1
/* iput v0, p0, Lorg/apache/log4j/lf5/viewer/TrackingAdjustmentListener;->a:I */
return;
} // .end method
