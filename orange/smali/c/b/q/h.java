public class c.b.q.h extends c.b.q.x implements androidx.appcompat.widget.ActionMenuView$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.k d; //synthetic
	 /* # direct methods */
	 public c.b.q.h ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 this.d = p1;
		 /* .line 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p2, v1, v0}, Lc/b/q/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 int p2 = 1; // const/4 p2, 0x1
		 /* .line 3 */
		 (( android.widget.ImageView ) p0 ).setClickable ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setClickable(Z)V
		 /* .line 4 */
		 (( android.widget.ImageView ) p0 ).setFocusable ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setFocusable(Z)V
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 5 */
		 (( android.widget.ImageView ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V
		 /* .line 6 */
		 (( android.widget.ImageView ) p0 ).setEnabled ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setEnabled(Z)V
		 /* .line 7 */
		 (( android.widget.ImageView ) p0 ).getContentDescription ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getContentDescription()Ljava/lang/CharSequence;
		 c.b.q.p2 .a ( p0,p2 );
		 /* .line 8 */
		 /* new-instance p2, Lc/b/q/g; */
		 /* invoke-direct {p2, p0, p0, p1}, Lc/b/q/g;-><init>(Lc/b/q/h;Landroid/view/View;Lc/b/q/k;)V */
		 (( android.widget.ImageView ) p0 ).setOnTouchListener ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean b ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean performClick ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = 		 /* invoke-super {p0}, Landroid/widget/ImageView;->performClick()Z */
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 (( android.widget.ImageView ) p0 ).playSoundEffect ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/ImageView;->playSoundEffect(I)V
		 /* .line 3 */
		 v0 = this.d;
		 (( c.b.q.k ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/q/k;->i()Z
	 } // .end method
	 public Boolean setFrame ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 p1 = 		 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ImageView;->setFrame(IIII)Z */
		 /* .line 2 */
		 (( android.widget.ImageView ) p0 ).getDrawable ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
		 /* .line 3 */
		 (( android.widget.ImageView ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 if ( p3 != null) { // if-eqz p3, :cond_0
				 /* .line 4 */
				 p2 = 				 (( android.widget.ImageView ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getWidth()I
				 /* .line 5 */
				 p4 = 				 (( android.widget.ImageView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getHeight()I
				 /* .line 6 */
				 v0 = 				 java.lang.Math .max ( p2,p4 );
				 /* div-int/lit8 v0, v0, 0x2 */
				 /* .line 7 */
				 v1 = 				 (( android.widget.ImageView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingLeft()I
				 v2 = 				 (( android.widget.ImageView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingRight()I
				 /* sub-int/2addr v1, v2 */
				 /* .line 8 */
				 v2 = 				 (( android.widget.ImageView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingTop()I
				 v3 = 				 (( android.widget.ImageView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getPaddingBottom()I
				 /* sub-int/2addr v2, v3 */
				 /* add-int/2addr p2, v1 */
				 /* .line 9 */
				 /* div-int/lit8 p2, p2, 0x2 */
				 /* add-int/2addr p4, v2 */
				 /* .line 10 */
				 /* div-int/lit8 p4, p4, 0x2 */
				 /* sub-int v1, p2, v0 */
				 /* sub-int v2, p4, v0 */
				 /* add-int/2addr p2, v0 */
				 /* add-int/2addr p4, v0 */
				 /* .line 11 */
				 c.h.g.r.a .a ( p3,v1,v2,p2,p4 );
			 } // :cond_0
		 } // .end method
