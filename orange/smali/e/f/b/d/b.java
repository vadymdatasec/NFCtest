public abstract class e.f.b.d.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.b.d.b ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 /* sub-int/2addr p0, p1 */
		 /* not-int p0, p0 */
		 /* not-int p0, p0 */
		 /* ushr-int/lit8 p0, p0, 0x1f */
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1, java.math.RoundingMode p2 ) {
		 /* .locals 5 */
		 /* .line 9 */
		 e.f.b.a.p .a ( p2 );
		 if ( p1 != null) { // if-eqz p1, :cond_8
			 /* .line 10 */
			 /* div-int v0, p0, p1 */
			 /* mul-int v1, p1, v0 */
			 /* sub-int v1, p0, v1 */
			 /* if-nez v1, :cond_0 */
		 } // :cond_0
		 /* xor-int/2addr p0, p1 */
		 /* shr-int/lit8 p0, p0, 0x1f */
		 int v2 = 1; // const/4 v2, 0x1
		 /* or-int/2addr p0, v2 */
		 /* .line 11 */
		 v3 = e.f.b.d.a.a;
		 v4 = 		 (( java.math.RoundingMode ) p2 ).ordinal ( ); // invoke-virtual {p2}, Ljava/math/RoundingMode;->ordinal()I
		 /* aget v3, v3, v4 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* packed-switch v3, :pswitch_data_0 */
		 /* .line 12 */
		 /* new-instance p0, Ljava/lang/AssertionError; */
		 /* invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V */
		 /* throw p0 */
		 /* .line 13 */
		 /* :pswitch_0 */
		 v1 = 		 java.lang.Math .abs ( v1 );
		 /* .line 14 */
		 p1 = 		 java.lang.Math .abs ( p1 );
		 /* sub-int/2addr p1, v1 */
		 /* sub-int/2addr v1, p1 */
		 /* if-nez v1, :cond_3 */
		 /* .line 15 */
		 p1 = java.math.RoundingMode.HALF_UP;
		 /* if-eq p2, p1, :cond_6 */
		 p1 = java.math.RoundingMode.HALF_EVEN;
		 /* if-ne p2, p1, :cond_1 */
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_1
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* and-int/lit8 p2, v0, 0x1 */
if ( p2 != null) { // if-eqz p2, :cond_2
	 int p2 = 1; // const/4 p2, 0x1
} // :cond_2
int p2 = 0; // const/4 p2, 0x0
} // :goto_1
/* and-int/2addr p1, p2 */
if ( p1 != null) { // if-eqz p1, :cond_5
} // :cond_3
/* if-lez v1, :cond_5 */
/* :pswitch_1 */
/* if-lez p0, :cond_5 */
/* :pswitch_2 */
/* if-gez p0, :cond_5 */
/* :pswitch_3 */
/* if-nez v1, :cond_4 */
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
/* .line 16 */
} // :goto_2
e.f.b.d.c .a ( v2 );
} // :cond_5
/* :pswitch_4 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_6
} // :goto_3
/* :pswitch_5 */
if ( v2 != null) { // if-eqz v2, :cond_7
/* add-int/2addr v0, p0 */
} // :cond_7
/* .line 17 */
} // :cond_8
/* new-instance p0, Ljava/lang/ArithmeticException; */
final String p1 = "/ by zero"; // const-string p1, "/ by zero"
/* invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_2 */
/* :pswitch_5 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static Integer a ( Integer p0, java.math.RoundingMode p1 ) {
/* .locals 1 */
final String v0 = "x"; // const-string v0, "x"
/* .line 1 */
e.f.b.d.c .a ( v0,p0 );
/* .line 2 */
v0 = e.f.b.d.a.a;
p1 = (( java.math.RoundingMode ) p1 ).ordinal ( ); // invoke-virtual {p1}, Ljava/math/RoundingMode;->ordinal()I
/* aget p1, v0, p1 */
/* packed-switch p1, :pswitch_data_0 */
/* .line 3 */
/* new-instance p0, Ljava/lang/AssertionError; */
/* invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V */
/* throw p0 */
/* .line 4 */
/* :pswitch_0 */
p1 = java.lang.Integer .numberOfLeadingZeros ( p0 );
/* const v0, -0x4afb0ccd */
/* ushr-int/2addr v0, p1 */
/* rsub-int/lit8 p1, p1, 0x1f */
/* .line 5 */
p0 = e.f.b.d.b .a ( v0,p0 );
/* add-int/2addr p1, p0 */
/* :pswitch_1 */
/* add-int/lit8 p0, p0, -0x1 */
/* .line 6 */
p0 = java.lang.Integer .numberOfLeadingZeros ( p0 );
/* rsub-int/lit8 p0, p0, 0x20 */
/* .line 7 */
/* :pswitch_2 */
p1 = e.f.b.d.b .a ( p0 );
e.f.b.d.c .a ( p1 );
/* .line 8 */
/* :pswitch_3 */
p0 = java.lang.Integer .numberOfLeadingZeros ( p0 );
/* rsub-int/lit8 p0, p0, 0x1f */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_3 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static Boolean a ( Integer p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* if-lez p0, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* add-int/lit8 v3, p0, -0x1 */
/* and-int/2addr p0, v3 */
/* if-nez p0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* and-int p0, v2, v0 */
} // .end method
public static Integer b ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* int-to-long v0, p0 */
/* int-to-long p0, p1 */
/* mul-long v0, v0, p0 */
/* .line 1 */
p0 = e.f.b.e.c .a ( v0,v1 );
} // .end method
