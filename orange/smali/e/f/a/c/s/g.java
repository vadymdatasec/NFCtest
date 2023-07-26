public class e.f.a.c.s.g implements com.google.android.material.behavior.SwipeDismissBehavior$b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.google.android.material.snackbar.BaseTransientBottomBar a; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int v0 = 1; // const/4 v0, 0x1
			 /* if-eq p1, v0, :cond_0 */
			 int v0 = 2; // const/4 v0, 0x2
			 /* if-eq p1, v0, :cond_0 */
			 /* .line 3 */
		 } // :cond_0
		 e.f.a.c.s.v .b ( );
		 v0 = this.a;
		 v0 = this.i;
		 (( e.f.a.c.s.v ) p1 ).f ( v0 ); // invoke-virtual {p1, v0}, Le/f/a/c/s/v;->f(Le/f/a/c/s/t;)V
		 /* .line 4 */
	 } // :cond_1
	 e.f.a.c.s.v .b ( );
	 v0 = this.a;
	 v0 = this.i;
	 (( e.f.a.c.s.v ) p1 ).g ( v0 ); // invoke-virtual {p1, v0}, Le/f/a/c/s/v;->g(Le/f/a/c/s/t;)V
} // :goto_0
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
/* const/16 v0, 0x8 */
/* .line 1 */
(( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
/* .line 2 */
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
(( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V
return;
} // .end method
