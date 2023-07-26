public class androidx.activity.result.ActivityResultRegistry$1 implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a; //synthetic
	 public final c.a.k.c b; //synthetic
	 public final c.a.k.i.a c; //synthetic
	 public final c.a.k.f d; //synthetic
	 /* # virtual methods */
	 public void a ( Object p0, c.n.g$a p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 p1 = c.n.g$a.ON_START;
		 p1 = 		 (( java.lang.Enum ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 2 */
			 p1 = this.d;
			 p1 = this.f;
			 p2 = this.a;
			 /* new-instance v0, Lc/a/k/f$a; */
			 v1 = this.b;
			 v2 = this.c;
			 /* invoke-direct {v0, v1, v2}, Lc/a/k/f$a;-><init>(Lc/a/k/c;Lc/a/k/i/a;)V */
			 /* .line 3 */
			 p1 = this.d;
			 p1 = this.g;
			 p1 = 			 p2 = this.a;
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 /* .line 4 */
				 p1 = this.d;
				 p1 = this.g;
				 p2 = this.a;
				 /* .line 5 */
				 p2 = this.d;
				 p2 = this.g;
				 v0 = this.a;
				 /* .line 6 */
				 p2 = this.b;
				 /* .line 7 */
			 } // :cond_0
			 p1 = this.d;
			 p1 = this.h;
			 p2 = this.a;
			 (( android.os.Bundle ) p1 ).getParcelable ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;
			 /* check-cast p1, Lc/a/k/b; */
			 if ( p1 != null) { // if-eqz p1, :cond_3
				 /* .line 8 */
				 p2 = this.d;
				 p2 = this.h;
				 v0 = this.a;
				 (( android.os.Bundle ) p2 ).remove ( v0 ); // invoke-virtual {p2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
				 /* .line 9 */
				 p2 = this.b;
				 v0 = this.c;
				 /* .line 10 */
				 v1 = 				 (( c.a.k.b ) p1 ).b ( ); // invoke-virtual {p1}, Lc/a/k/b;->b()I
				 /* .line 11 */
				 (( c.a.k.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/a/k/b;->a()Landroid/content/Intent;
				 /* .line 12 */
				 (( c.a.k.i.a ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lc/a/k/i/a;->a(ILandroid/content/Intent;)Ljava/lang/Object;
				 /* .line 13 */
			 } // :cond_1
			 p1 = c.n.g$a.ON_STOP;
			 p1 = 			 (( java.lang.Enum ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_2
				 /* .line 14 */
				 p1 = this.d;
				 p1 = this.f;
				 p2 = this.a;
				 /* .line 15 */
			 } // :cond_2
			 p1 = c.n.g$a.ON_DESTROY;
			 p1 = 			 (( java.lang.Enum ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
			 if ( p1 != null) { // if-eqz p1, :cond_3
				 /* .line 16 */
				 p1 = this.d;
				 p2 = this.a;
				 (( c.a.k.f ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/a/k/f;->b(Ljava/lang/String;)V
			 } // :cond_3
		 } // :goto_0
		 return;
	 } // .end method
