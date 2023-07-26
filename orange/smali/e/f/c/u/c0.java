public class e.f.c.u.c0 implements android.os.Parcelable$Creator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Landroid/os/Parcelable$Creator<", */
	 /* "Le/f/c/u/b0;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.f.c.u.c0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static void a ( e.f.c.u.b0 p0, android.os.Parcel p1, Integer p2 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 p2 = 	 e.f.a.b.c.m.j.b .a ( p1 );
	 /* .line 2 */
	 p0 = this.b;
	 int v0 = 2; // const/4 v0, 0x2
	 int v1 = 0; // const/4 v1, 0x0
	 e.f.a.b.c.m.j.b .a ( p1,v0,p0,v1 );
	 /* .line 3 */
	 e.f.a.b.c.m.j.b .a ( p1,p2 );
	 return;
} // .end method
/* # virtual methods */
public e.f.c.u.b0 createFromParcel ( android.os.Parcel p0 ) {
	 /* .locals 5 */
	 /* .line 1 */
	 v0 = 	 com.google.android.gms.common.internal.safeparcel.SafeParcelReader .b ( p1 );
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 2 */
} // :goto_0
v2 = (( android.os.Parcel ) p1 ).dataPosition ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I
/* if-ge v2, v0, :cond_1 */
/* .line 3 */
v2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p1 );
/* .line 4 */
v3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( v2 );
int v4 = 2; // const/4 v4, 0x2
/* if-eq v3, v4, :cond_0 */
/* .line 5 */
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .j ( p1,v2 );
/* .line 6 */
} // :cond_0
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .a ( p1,v2 );
/* .line 7 */
} // :cond_1
com.google.android.gms.common.internal.safeparcel.SafeParcelReader .d ( p1,v0 );
/* .line 8 */
/* new-instance p1, Le/f/c/u/b0; */
/* invoke-direct {p1, v1}, Le/f/c/u/b0;-><init>(Landroid/os/Bundle;)V */
} // .end method
public java.lang.Object createFromParcel ( android.os.Parcel p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 9 */
(( e.f.c.u.c0 ) p0 ).createFromParcel ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/c0;->createFromParcel(Landroid/os/Parcel;)Le/f/c/u/b0;
} // .end method
public e.f.c.u.b0 newArray ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* new-array p1, p1, [Le/f/c/u/b0; */
} // .end method
public java.lang.Object newArray ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( e.f.c.u.c0 ) p0 ).newArray ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/c0;->newArray(I)[Le/f/c/u/b0;
} // .end method
