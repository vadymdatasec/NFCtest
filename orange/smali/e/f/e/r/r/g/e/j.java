public abstract class e.f.e.r.r.g.e.j {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.e.o.a a;
	 public final e.f.e.r.r.g.e.t b;
	 /* # direct methods */
	 public e.f.e.r.r.g.e.j ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 /* new-instance v0, Le/f/e/r/r/g/e/t; */
		 /* invoke-direct {v0, p1}, Le/f/e/r/r/g/e/t;-><init>(Le/f/e/o/a;)V */
		 this.b = v0;
		 return;
	 } // .end method
	 public static e.f.e.r.r.g.e.j a ( Object p0 ) {
		 /* .locals 7 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 v1 = 		 (( e.f.e.o.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/e/o/a;->a(I)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 3 */
			 /* new-instance v0, Le/f/e/r/r/g/e/g; */
			 /* invoke-direct {v0, p0}, Le/f/e/r/r/g/e/g;-><init>(Le/f/e/o/a;)V */
		 } // :cond_0
		 int v1 = 2; // const/4 v1, 0x2
		 /* .line 4 */
		 v1 = 		 (( e.f.e.o.a ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/e/o/a;->a(I)Z
		 /* if-nez v1, :cond_1 */
		 /* .line 5 */
		 /* new-instance v0, Le/f/e/r/r/g/e/k; */
		 /* invoke-direct {v0, p0}, Le/f/e/r/r/g/e/k;-><init>(Le/f/e/o/a;)V */
	 } // :cond_1
	 int v1 = 4; // const/4 v1, 0x4
	 /* .line 6 */
	 v2 = 	 e.f.e.r.r.g.e.t .a ( p0,v0,v1 );
	 /* if-eq v2, v1, :cond_5 */
	 int v1 = 5; // const/4 v1, 0x5
	 /* if-eq v2, v1, :cond_4 */
	 /* .line 7 */
	 v1 = 	 e.f.e.r.r.g.e.t .a ( p0,v0,v1 );
	 /* const/16 v2, 0xc */
	 /* if-eq v1, v2, :cond_3 */
	 /* const/16 v2, 0xd */
	 /* if-eq v1, v2, :cond_2 */
	 int v1 = 7; // const/4 v1, 0x7
	 /* .line 8 */
	 v0 = 	 e.f.e.r.r.g.e.t .a ( p0,v0,v1 );
	 final String v1 = "17"; // const-string v1, "17"
	 final String v2 = "15"; // const-string v2, "15"
	 final String v3 = "13"; // const-string v3, "13"
	 final String v4 = "11"; // const-string v4, "11"
	 final String v5 = "320"; // const-string v5, "320"
	 final String v6 = "310"; // const-string v6, "310"
	 /* packed-switch v0, :pswitch_data_0 */
	 /* .line 9 */
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "unknown decoder: "; // const-string v2, "unknown decoder: "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 10 */
	 /* :pswitch_0 */
	 /* new-instance v0, Le/f/e/r/r/g/e/e; */
	 /* invoke-direct {v0, p0, v5, v1}, Le/f/e/r/r/g/e/e;-><init>(Le/f/e/o/a;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 11 */
	 /* :pswitch_1 */
	 /* new-instance v0, Le/f/e/r/r/g/e/e; */
	 /* invoke-direct {v0, p0, v6, v1}, Le/f/e/r/r/g/e/e;-><init>(Le/f/e/o/a;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 12 */
	 /* :pswitch_2 */
	 /* new-instance v0, Le/f/e/r/r/g/e/e; */
	 /* invoke-direct {v0, p0, v5, v2}, Le/f/e/r/r/g/e/e;-><init>(Le/f/e/o/a;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 13 */
	 /* :pswitch_3 */
	 /* new-instance v0, Le/f/e/r/r/g/e/e; */
	 /* invoke-direct {v0, p0, v6, v2}, Le/f/e/r/r/g/e/e;-><init>(Le/f/e/o/a;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 14 */
	 /* :pswitch_4 */
	 /* new-instance v0, Le/f/e/r/r/g/e/e; */
	 /* invoke-direct {v0, p0, v5, v3}, Le/f/e/r/r/g/e/e;-><init>(Le/f/e/o/a;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 15 */
	 /* :pswitch_5 */
	 /* new-instance v0, Le/f/e/r/r/g/e/e; */
	 /* invoke-direct {v0, p0, v6, v3}, Le/f/e/r/r/g/e/e;-><init>(Le/f/e/o/a;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 16 */
	 /* :pswitch_6 */
	 /* new-instance v0, Le/f/e/r/r/g/e/e; */
	 /* invoke-direct {v0, p0, v5, v4}, Le/f/e/r/r/g/e/e;-><init>(Le/f/e/o/a;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 17 */
	 /* :pswitch_7 */
	 /* new-instance v0, Le/f/e/r/r/g/e/e; */
	 /* invoke-direct {v0, p0, v6, v4}, Le/f/e/r/r/g/e/e;-><init>(Le/f/e/o/a;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 18 */
} // :cond_2
/* new-instance v0, Le/f/e/r/r/g/e/d; */
/* invoke-direct {v0, p0}, Le/f/e/r/r/g/e/d;-><init>(Le/f/e/o/a;)V */
/* .line 19 */
} // :cond_3
/* new-instance v0, Le/f/e/r/r/g/e/c; */
/* invoke-direct {v0, p0}, Le/f/e/r/r/g/e/c;-><init>(Le/f/e/o/a;)V */
/* .line 20 */
} // :cond_4
/* new-instance v0, Le/f/e/r/r/g/e/b; */
/* invoke-direct {v0, p0}, Le/f/e/r/r/g/e/b;-><init>(Le/f/e/o/a;)V */
/* .line 21 */
} // :cond_5
/* new-instance v0, Le/f/e/r/r/g/e/a; */
/* invoke-direct {v0, p0}, Le/f/e/r/r/g/e/a;-><init>(Le/f/e/o/a;)V */
/* :pswitch_data_0 */
/* .packed-switch 0x38 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public final e.f.e.r.r.g.e.t a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public final e.f.e.o.a b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public abstract java.lang.String c ( ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException;, */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
} // .end method
