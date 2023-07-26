public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final k.u0 a;
	 public final k.z0 b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 public static Boolean a ( k.z0 p0, k.u0 p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = 		 (( k.z0 ) p0 ).m ( ); // invoke-virtual {p0}, Lk/z0;->m()I
		 /* const/16 v1, 0xc8 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-eq v0, v1, :cond_2 */
		 /* const/16 v1, 0x19a */
		 /* if-eq v0, v1, :cond_2 */
		 /* const/16 v1, 0x19e */
		 /* if-eq v0, v1, :cond_2 */
		 /* const/16 v1, 0x1f5 */
		 /* if-eq v0, v1, :cond_2 */
		 /* const/16 v1, 0xcb */
		 /* if-eq v0, v1, :cond_2 */
		 /* const/16 v1, 0xcc */
		 /* if-eq v0, v1, :cond_2 */
		 /* const/16 v1, 0x133 */
		 /* if-eq v0, v1, :cond_0 */
		 /* const/16 v1, 0x134 */
		 /* if-eq v0, v1, :cond_2 */
		 /* const/16 v1, 0x194 */
		 /* if-eq v0, v1, :cond_2 */
		 /* const/16 v1, 0x195 */
		 /* if-eq v0, v1, :cond_2 */
		 /* packed-switch v0, :pswitch_data_0 */
	 } // :cond_0
	 /* :pswitch_0 */
	 final String v0 = "Expires"; // const-string v0, "Expires"
	 /* .line 2 */
	 (( k.z0 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;
	 /* if-nez v0, :cond_2 */
	 /* .line 3 */
	 (( k.z0 ) p0 ).l ( ); // invoke-virtual {p0}, Lk/z0;->l()Lk/f;
	 v0 = 	 (( k.f ) v0 ).d ( ); // invoke-virtual {v0}, Lk/f;->d()I
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-ne v0, v1, :cond_2 */
	 /* .line 4 */
	 (( k.z0 ) p0 ).l ( ); // invoke-virtual {p0}, Lk/z0;->l()Lk/f;
	 v0 = 	 (( k.f ) v0 ).c ( ); // invoke-virtual {v0}, Lk/f;->c()Z
	 /* if-nez v0, :cond_2 */
	 /* .line 5 */
	 (( k.z0 ) p0 ).l ( ); // invoke-virtual {p0}, Lk/z0;->l()Lk/f;
	 v0 = 	 (( k.f ) v0 ).b ( ); // invoke-virtual {v0}, Lk/f;->b()Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
	 } // :cond_1
} // :goto_0
/* .line 6 */
} // :cond_2
} // :goto_1
/* :pswitch_1 */
(( k.z0 ) p0 ).l ( ); // invoke-virtual {p0}, Lk/z0;->l()Lk/f;
p0 = (( k.f ) p0 ).i ( ); // invoke-virtual {p0}, Lk/f;->i()Z
/* if-nez p0, :cond_3 */
(( k.u0 ) p1 ).b ( ); // invoke-virtual {p1}, Lk/u0;->b()Lk/f;
p0 = (( k.f ) p0 ).i ( ); // invoke-virtual {p0}, Lk/f;->i()Z
/* if-nez p0, :cond_3 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_3
/* :pswitch_data_0 */
/* .packed-switch 0x12c */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
