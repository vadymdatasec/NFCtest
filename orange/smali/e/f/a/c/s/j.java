public class e.f.a.c.s.j implements e.f.a.c.s.o {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.google.android.material.snackbar.BaseTransientBottomBar a; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = this.c;
		 int p2 = 0; // const/4 p2, 0x0
		 (( com.google.android.material.snackbar.BaseTransientBottomBar$b ) p1 ).setOnLayoutChangeListener ( p2 ); // invoke-virtual {p1, p2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->setOnLayoutChangeListener(Le/f/a/c/s/o;)V
		 /* .line 2 */
		 p1 = this.a;
		 p1 = 		 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).k ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k()Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 3 */
			 p1 = this.a;
			 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->a()V
			 /* .line 4 */
		 } // :cond_0
		 p1 = this.a;
		 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).j ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->j()V
	 } // :goto_0
	 return;
} // .end method
