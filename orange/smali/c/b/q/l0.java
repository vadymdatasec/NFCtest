public class c.b.q.l0 implements android.widget.PopupWindow$OnDismissListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.ViewTreeObserver$OnGlobalLayoutListener b; //synthetic
	 public final c.b.q.m0 c; //synthetic
	 /* # direct methods */
	 public c.b.q.l0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDismiss ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.c;
		 v0 = this.N;
		 (( android.widget.Spinner ) v0 ).getViewTreeObserver ( ); // invoke-virtual {v0}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v1 = this.b;
			 (( android.view.ViewTreeObserver ) v0 ).removeGlobalOnLayoutListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
		 } // :cond_0
		 return;
	 } // .end method
