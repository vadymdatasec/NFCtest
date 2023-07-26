public class c.b.q.o1 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.p1 b; //synthetic
	 /* # direct methods */
	 public c.b.q.o1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = this.d;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 c.h.n.v0 .C ( v0 );
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = this.b;
				 v0 = this.d;
				 /* .line 2 */
				 v0 = 				 (( android.widget.ListView ) v0 ).getCount ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getCount()I
				 v1 = this.b;
				 v1 = this.d;
				 v1 = 				 (( android.widget.ListView ) v1 ).getChildCount ( ); // invoke-virtual {v1}, Landroid/widget/ListView;->getChildCount()I
				 /* if-le v0, v1, :cond_0 */
				 v0 = this.b;
				 v0 = this.d;
				 /* .line 3 */
				 v0 = 				 (( android.widget.ListView ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getChildCount()I
				 v1 = this.b;
				 /* iget v2, v1, Lc/b/q/p1;->p:I */
				 /* if-gt v0, v2, :cond_0 */
				 /* .line 4 */
				 v0 = this.F;
				 int v1 = 2; // const/4 v1, 0x2
				 (( android.widget.PopupWindow ) v0 ).setInputMethodMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
				 /* .line 5 */
				 v0 = this.b;
				 (( c.b.q.p1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/p1;->a()V
			 } // :cond_0
			 return;
		 } // .end method
