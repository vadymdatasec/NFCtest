public class m.a.b.f extends java.util.GregorianCalendar {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer b;
	 /* # direct methods */
	 public m.a.b.f ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/util/GregorianCalendar;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Lm/a/b/f;->b:I */
		 return;
	 } // .end method
	 public m.a.b.f ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* .line 4 */
		 /* iput p1, p0, Lm/a/b/f;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.util.Date a ( java.util.Date p0 ) {
		 /* .locals 10 */
		 /* .line 2 */
		 (( java.util.GregorianCalendar ) p0 ).setTime ( p1 ); // invoke-virtual {p0, p1}, Ljava/util/GregorianCalendar;->setTime(Ljava/util/Date;)V
		 /* .line 3 */
		 /* iget p1, p0, Lm/a/b/f;->b:I */
		 /* const/16 v0, 0xe */
		 /* const/16 v1, 0xd */
		 /* const/16 v2, 0xc */
		 int v3 = 1; // const/4 v3, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_6
			 /* const/16 v5, 0xb */
			 /* if-eq p1, v3, :cond_5 */
			 int v6 = 2; // const/4 v6, 0x2
			 int v7 = 5; // const/4 v7, 0x5
			 /* if-eq p1, v6, :cond_3 */
			 int v8 = 3; // const/4 v8, 0x3
			 /* if-eq p1, v8, :cond_2 */
			 int v9 = 4; // const/4 v9, 0x4
			 /* if-eq p1, v9, :cond_1 */
			 /* if-ne p1, v7, :cond_0 */
			 /* .line 4 */
			 (( java.util.GregorianCalendar ) p0 ).set ( v7, v3 ); // invoke-virtual {p0, v7, v3}, Ljava/util/GregorianCalendar;->set(II)V
			 /* .line 5 */
			 (( java.util.GregorianCalendar ) p0 ).set ( v5, v4 ); // invoke-virtual {p0, v5, v4}, Ljava/util/GregorianCalendar;->set(II)V
			 /* .line 6 */
			 (( java.util.GregorianCalendar ) p0 ).set ( v2, v4 ); // invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V
			 /* .line 7 */
			 (( java.util.GregorianCalendar ) p0 ).set ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V
			 /* .line 8 */
			 (( java.util.GregorianCalendar ) p0 ).set ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V
			 /* .line 9 */
			 (( java.util.GregorianCalendar ) p0 ).add ( v6, v3 ); // invoke-virtual {p0, v6, v3}, Ljava/util/GregorianCalendar;->add(II)V
			 /* .line 10 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalStateException; */
		 final String v0 = "Unknown periodicity type."; // const-string v0, "Unknown periodicity type."
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // :cond_1
	 int p1 = 7; // const/4 p1, 0x7
	 /* .line 11 */
	 v6 = 	 (( java.util.GregorianCalendar ) p0 ).getFirstDayOfWeek ( ); // invoke-virtual {p0}, Ljava/util/GregorianCalendar;->getFirstDayOfWeek()I
	 (( java.util.GregorianCalendar ) p0 ).set ( p1, v6 ); // invoke-virtual {p0, p1, v6}, Ljava/util/GregorianCalendar;->set(II)V
	 /* .line 12 */
	 (( java.util.GregorianCalendar ) p0 ).set ( v5, v4 ); // invoke-virtual {p0, v5, v4}, Ljava/util/GregorianCalendar;->set(II)V
	 /* .line 13 */
	 (( java.util.GregorianCalendar ) p0 ).set ( v2, v4 ); // invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V
	 /* .line 14 */
	 (( java.util.GregorianCalendar ) p0 ).set ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V
	 /* .line 15 */
	 (( java.util.GregorianCalendar ) p0 ).set ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V
	 /* .line 16 */
	 (( java.util.GregorianCalendar ) p0 ).add ( v8, v3 ); // invoke-virtual {p0, v8, v3}, Ljava/util/GregorianCalendar;->add(II)V
	 /* .line 17 */
} // :cond_2
(( java.util.GregorianCalendar ) p0 ).set ( v5, v4 ); // invoke-virtual {p0, v5, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 18 */
(( java.util.GregorianCalendar ) p0 ).set ( v2, v4 ); // invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 19 */
(( java.util.GregorianCalendar ) p0 ).set ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 20 */
(( java.util.GregorianCalendar ) p0 ).set ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 21 */
(( java.util.GregorianCalendar ) p0 ).add ( v7, v3 ); // invoke-virtual {p0, v7, v3}, Ljava/util/GregorianCalendar;->add(II)V
/* .line 22 */
} // :cond_3
(( java.util.GregorianCalendar ) p0 ).set ( v2, v4 ); // invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 23 */
(( java.util.GregorianCalendar ) p0 ).set ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 24 */
(( java.util.GregorianCalendar ) p0 ).set ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 25 */
p1 = (( java.util.GregorianCalendar ) p0 ).get ( v5 ); // invoke-virtual {p0, v5}, Ljava/util/GregorianCalendar;->get(I)I
/* if-ge p1, v2, :cond_4 */
/* .line 26 */
(( java.util.GregorianCalendar ) p0 ).set ( v5, v2 ); // invoke-virtual {p0, v5, v2}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 27 */
} // :cond_4
(( java.util.GregorianCalendar ) p0 ).set ( v5, v4 ); // invoke-virtual {p0, v5, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 28 */
(( java.util.GregorianCalendar ) p0 ).add ( v7, v3 ); // invoke-virtual {p0, v7, v3}, Ljava/util/GregorianCalendar;->add(II)V
/* .line 29 */
} // :cond_5
(( java.util.GregorianCalendar ) p0 ).set ( v2, v4 ); // invoke-virtual {p0, v2, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 30 */
(( java.util.GregorianCalendar ) p0 ).set ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 31 */
(( java.util.GregorianCalendar ) p0 ).set ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 32 */
(( java.util.GregorianCalendar ) p0 ).add ( v5, v3 ); // invoke-virtual {p0, v5, v3}, Ljava/util/GregorianCalendar;->add(II)V
/* .line 33 */
} // :cond_6
(( java.util.GregorianCalendar ) p0 ).set ( v1, v4 ); // invoke-virtual {p0, v1, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 34 */
(( java.util.GregorianCalendar ) p0 ).set ( v0, v4 ); // invoke-virtual {p0, v0, v4}, Ljava/util/GregorianCalendar;->set(II)V
/* .line 35 */
(( java.util.GregorianCalendar ) p0 ).add ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Ljava/util/GregorianCalendar;->add(II)V
/* .line 36 */
} // :goto_0
(( java.util.GregorianCalendar ) p0 ).getTime ( ); // invoke-virtual {p0}, Ljava/util/GregorianCalendar;->getTime()Ljava/util/Date;
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lm/a/b/f;->b:I */
return;
} // .end method
public Long b ( java.util.Date p0 ) {
/* .locals 2 */
/* .line 1 */
(( m.a.b.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/a/b/f;->a(Ljava/util/Date;)Ljava/util/Date;
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
