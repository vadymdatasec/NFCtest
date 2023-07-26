public abstract class e.f.a.b.c.m.j.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.os.Parcel p0 ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x4f45 */
		 /* .line 1 */
		 p0 = 		 e.f.a.b.c.m.j.b .b ( p0,v0 );
	 } // .end method
	 public static void a ( android.os.Parcel p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 e.f.a.b.c.m.j.b .c ( p0,p1 );
		 return;
	 } // .end method
	 public static void a ( android.os.Parcel p0, Integer p1, Float p2 ) {
		 /* .locals 1 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* .line 9 */
		 e.f.a.b.c.m.j.b .b ( p0,p1,v0 );
		 /* .line 10 */
		 (( android.os.Parcel ) p0 ).writeFloat ( p2 ); // invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeFloat(F)V
		 return;
	 } // .end method
	 public static void a ( android.os.Parcel p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* .line 5 */
		 e.f.a.b.c.m.j.b .b ( p0,p1,v0 );
		 /* .line 6 */
		 (( android.os.Parcel ) p0 ).writeInt ( p2 ); // invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeInt(I)V
		 return;
	 } // .end method
	 public static void a ( android.os.Parcel p0, Integer p1, Long p2 ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x8 */
		 /* .line 7 */
		 e.f.a.b.c.m.j.b .b ( p0,p1,v0 );
		 /* .line 8 */
		 (( android.os.Parcel ) p0 ).writeLong ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/os/Parcel;->writeLong(J)V
		 return;
	 } // .end method
	 public static void a ( android.os.Parcel p0, Integer p1, android.os.Bundle p2, Boolean p3 ) {
		 /* .locals 0 */
		 /* if-nez p2, :cond_1 */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 int p2 = 0; // const/4 p2, 0x0
			 /* .line 19 */
			 e.f.a.b.c.m.j.b .b ( p0,p1,p2 );
		 } // :cond_0
		 return;
		 /* .line 20 */
	 } // :cond_1
	 p1 = 	 e.f.a.b.c.m.j.b .b ( p0,p1 );
	 /* .line 21 */
	 (( android.os.Parcel ) p0 ).writeBundle ( p2 ); // invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V
	 /* .line 22 */
	 e.f.a.b.c.m.j.b .c ( p0,p1 );
	 return;
} // .end method
public static void a ( android.os.Parcel p0, Integer p1, android.os.Parcelable p2, Integer p3, Boolean p4 ) {
	 /* .locals 0 */
	 /* if-nez p2, :cond_1 */
	 if ( p4 != null) { // if-eqz p4, :cond_0
		 int p2 = 0; // const/4 p2, 0x0
		 /* .line 15 */
		 e.f.a.b.c.m.j.b .b ( p0,p1,p2 );
	 } // :cond_0
	 return;
	 /* .line 16 */
} // :cond_1
p1 = e.f.a.b.c.m.j.b .b ( p0,p1 );
/* .line 17 */
/* .line 18 */
e.f.a.b.c.m.j.b .c ( p0,p1 );
return;
} // .end method
public static void a ( android.os.Parcel p0, Integer p1, java.lang.String p2, Boolean p3 ) {
/* .locals 0 */
/* if-nez p2, :cond_1 */
if ( p3 != null) { // if-eqz p3, :cond_0
	 int p2 = 0; // const/4 p2, 0x0
	 /* .line 11 */
	 e.f.a.b.c.m.j.b .b ( p0,p1,p2 );
} // :cond_0
return;
/* .line 12 */
} // :cond_1
p1 = e.f.a.b.c.m.j.b .b ( p0,p1 );
/* .line 13 */
(( android.os.Parcel ) p0 ).writeString ( p2 ); // invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
/* .line 14 */
e.f.a.b.c.m.j.b .c ( p0,p1 );
return;
} // .end method
public static void a ( android.os.Parcel p0, Integer p1, java.util.List p2, Boolean p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/os/Parcel;", */
/* "I", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;Z)V" */
/* } */
} // .end annotation
/* if-nez p2, :cond_1 */
if ( p3 != null) { // if-eqz p3, :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 23 */
e.f.a.b.c.m.j.b .b ( p0,p1,p2 );
} // :cond_0
return;
/* .line 24 */
} // :cond_1
p1 = e.f.a.b.c.m.j.b .b ( p0,p1 );
/* .line 25 */
(( android.os.Parcel ) p0 ).writeStringList ( p2 ); // invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V
/* .line 26 */
e.f.a.b.c.m.j.b .c ( p0,p1 );
return;
} // .end method
public static void a ( android.os.Parcel p0, Integer p1, Boolean p2 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* .line 3 */
e.f.a.b.c.m.j.b .b ( p0,p1,v0 );
/* .line 4 */
(( android.os.Parcel ) p0 ).writeInt ( p2 ); // invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
public static Integer b ( android.os.Parcel p0, Integer p1 ) {
/* .locals 1 */
/* const/high16 v0, -0x10000 */
/* or-int/2addr p1, v0 */
/* .line 4 */
(( android.os.Parcel ) p0 ).writeInt ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
(( android.os.Parcel ) p0 ).writeInt ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V
/* .line 6 */
p0 = (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
} // .end method
public static void b ( android.os.Parcel p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* const v0, 0xffff */
/* if-lt p2, v0, :cond_0 */
/* const/high16 v0, -0x10000 */
/* or-int/2addr p1, v0 */
/* .line 1 */
(( android.os.Parcel ) p0 ).writeInt ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V
/* .line 2 */
(( android.os.Parcel ) p0 ).writeInt ( p2 ); // invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeInt(I)V
return;
} // :cond_0
/* shl-int/lit8 p2, p2, 0x10 */
/* or-int/2addr p1, p2 */
/* .line 3 */
(( android.os.Parcel ) p0 ).writeInt ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V
return;
} // .end method
public static void c ( android.os.Parcel p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.os.Parcel ) p0 ).dataPosition ( ); // invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I
/* sub-int v1, v0, p1 */
/* add-int/lit8 p1, p1, -0x4 */
/* .line 2 */
(( android.os.Parcel ) p0 ).setDataPosition ( p1 ); // invoke-virtual {p0, p1}, Landroid/os/Parcel;->setDataPosition(I)V
/* .line 3 */
(( android.os.Parcel ) p0 ).writeInt ( v1 ); // invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V
/* .line 4 */
(( android.os.Parcel ) p0 ).setDataPosition ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V
return;
} // .end method
