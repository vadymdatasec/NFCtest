public class com.orange.hce.proto.ScrollViewWithMaxHeight extends android.widget.ScrollView {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer b;
	 /* # direct methods */
	 public com.orange.hce.proto.ScrollViewWithMaxHeight ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V */
		 /* const p1, 0x7fffffff */
		 /* .line 2 */
		 /* iput p1, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I */
		 return;
	 } // .end method
	 public com.orange.hce.proto.ScrollViewWithMaxHeight ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 4 */
		 p1 = 		 (( com.orange.hce.proto.ScrollViewWithMaxHeight ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->a(Landroid/util/AttributeSet;)I
		 /* iput p1, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I */
		 return;
	 } // .end method
	 public com.orange.hce.proto.ScrollViewWithMaxHeight ( ) {
		 /* .locals 0 */
		 /* .line 5 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 6 */
		 p1 = 		 (( com.orange.hce.proto.ScrollViewWithMaxHeight ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->a(Landroid/util/AttributeSet;)I
		 /* iput p1, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I */
		 return;
	 } // .end method
	 public com.orange.hce.proto.ScrollViewWithMaxHeight ( ) {
		 /* .locals 0 */
		 /* .line 7 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
		 /* .line 8 */
		 p1 = 		 (( com.orange.hce.proto.ScrollViewWithMaxHeight ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->a(Landroid/util/AttributeSet;)I
		 /* iput p1, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( android.util.AttributeSet p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( android.widget.ScrollView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/ScrollView;->getContext()Landroid/content/Context;
		 v1 = e.h.b.a.i.ScrollViewWithMaxHeight;
		 (( android.content.Context ) v0 ).obtainStyledAttributes ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
		 int v0 = 0; // const/4 v0, 0x0
		 /* const v1, 0x7fffffff */
		 /* .line 2 */
		 v0 = 		 (( android.content.res.TypedArray ) p1 ).getInt ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
		 /* .line 3 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 } // .end method
	 public void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget p2, p0, Lcom/orange/hce/proto/ScrollViewWithMaxHeight;->b:I */
		 /* int-to-float p2, p2 */
		 (( android.widget.ScrollView ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/widget/ScrollView;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
		 /* mul-float p2, p2, v0 */
		 /* .line 2 */
		 p2 = 		 java.lang.Math .round ( p2 );
		 /* const/high16 v0, -0x80000000 */
		 p2 = 		 android.view.View$MeasureSpec .makeMeasureSpec ( p2,v0 );
		 /* .line 3 */
		 /* invoke-super {p0, p1, p2}, Landroid/widget/ScrollView;->onMeasure(II)V */
		 return;
	 } // .end method
