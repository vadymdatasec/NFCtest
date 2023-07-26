public class androidx.constraintlayout.widget.Guideline extends android.view.View {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public androidx.constraintlayout.widget.Guideline ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
		 /* const/16 p1, 0x8 */
		 /* .line 2 */
		 /* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
		 return;
	 } // .end method
	 public androidx.constraintlayout.widget.Guideline ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* const/16 p1, 0x8 */
		 /* .line 4 */
		 /* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
		 return;
	 } // .end method
	 public androidx.constraintlayout.widget.Guideline ( ) {
		 /* .locals 0 */
		 /* .line 5 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* const/16 p1, 0x8 */
		 /* .line 6 */
		 /* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
		 return;
	 } // .end method
	 public androidx.constraintlayout.widget.Guideline ( ) {
		 /* .locals 0 */
		 /* .line 7 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* const/16 p1, 0x8 */
		 /* .line 8 */
		 /* invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void draw ( android.graphics.Canvas p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 1 */
		 (( android.view.View ) p0 ).setMeasuredDimension ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V
		 return;
	 } // .end method
	 public void setGuidelineBegin ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a; */
		 /* .line 2 */
		 /* iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:I */
		 /* .line 3 */
		 (( android.view.View ) p0 ).setLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 public void setGuidelineEnd ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a; */
		 /* .line 2 */
		 /* iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b:I */
		 /* .line 3 */
		 (( android.view.View ) p0 ).setLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 public void setGuidelinePercent ( Float p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a; */
		 /* .line 2 */
		 /* iput p1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c:F */
		 /* .line 3 */
		 (( android.view.View ) p0 ).setLayoutParams ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 public void setVisibility ( Integer p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
