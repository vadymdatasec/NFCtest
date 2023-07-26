public class e.a.a.g implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.a.a.p b;
	 public final e.a.a.v c;
	 public final java.lang.Runnable d;
	 /* # direct methods */
	 public e.a.a.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 this.c = p2;
		 /* .line 4 */
		 this.d = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( e.a.a.p ) v0 ).r ( ); // invoke-virtual {v0}, Le/a/a/p;->r()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.b;
			 final String v1 = "canceled-at-delivery"; // const-string v1, "canceled-at-delivery"
			 (( e.a.a.p ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/a/a/p;->b(Ljava/lang/String;)V
			 return;
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.c;
		 v0 = 		 (( e.a.a.v ) v0 ).a ( ); // invoke-virtual {v0}, Le/a/a/v;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 v0 = this.b;
			 v1 = this.c;
			 v1 = this.a;
			 (( e.a.a.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/a/a/p;->a(Ljava/lang/Object;)V
			 /* .line 5 */
		 } // :cond_1
		 v0 = this.b;
		 v1 = this.c;
		 v1 = this.c;
		 (( e.a.a.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/a/a/p;->a(Lcom/android/volley/VolleyError;)V
		 /* .line 6 */
	 } // :goto_0
	 v0 = this.c;
	 /* iget-boolean v0, v0, Le/a/a/v;->d:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 7 */
		 v0 = this.b;
		 final String v1 = "intermediate-response"; // const-string v1, "intermediate-response"
		 (( e.a.a.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/a/a/p;->a(Ljava/lang/String;)V
		 /* .line 8 */
	 } // :cond_2
	 v0 = this.b;
	 final String v1 = "done"; // const-string v1, "done"
	 (( e.a.a.p ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/a/a/p;->b(Ljava/lang/String;)V
	 /* .line 9 */
} // :goto_1
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 10 */
} // :cond_3
return;
} // .end method
