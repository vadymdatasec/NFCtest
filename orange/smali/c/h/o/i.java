public class c.h.o.i extends c.h.o.c {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.widget.ListView t;
	 /* # direct methods */
	 public c.h.o.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lc/h/o/c;-><init>(Landroid/view/View;)V */
		 /* .line 2 */
		 this.t = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.t;
		 c.h.o.j .b ( p1,p2 );
		 return;
	 } // .end method
	 public Boolean a ( Integer p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public Boolean b ( Integer p0 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 v0 = this.t;
		 /* .line 2 */
		 v1 = 		 (( android.widget.ListView ) v0 ).getCount ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-nez v1, :cond_0 */
		 /* .line 3 */
	 } // :cond_0
	 v3 = 	 (( android.widget.ListView ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I
	 /* .line 4 */
	 v4 = 	 (( android.widget.ListView ) v0 ).getFirstVisiblePosition ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getFirstVisiblePosition()I
	 /* add-int v5, v4, v3 */
	 int v6 = 1; // const/4 v6, 0x1
	 /* if-lez p1, :cond_1 */
	 /* if-lt v5, v1, :cond_2 */
	 /* sub-int/2addr v3, v6 */
	 /* .line 5 */
	 (( android.widget.ListView ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
	 /* .line 6 */
	 p1 = 	 (( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
	 v0 = 	 (( android.widget.ListView ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getHeight()I
	 /* if-gt p1, v0, :cond_2 */
} // :cond_1
/* if-gez p1, :cond_3 */
/* if-gtz v4, :cond_2 */
/* .line 7 */
(( android.widget.ListView ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
/* .line 8 */
p1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* if-ltz p1, :cond_2 */
} // :cond_2
} // :cond_3
} // .end method
