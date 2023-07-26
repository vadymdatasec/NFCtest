public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public final java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Landroid/os/ParcelUuid;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final android.util.SparseArray c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray<", */
/* "[B>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Map d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Landroid/os/ParcelUuid;", */
/* "[B>;" */
/* } */
} // .end annotation
} // .end field
public final Integer e;
public final java.lang.String f;
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/os/ParcelUuid;", */
/* ">;", */
/* "Landroid/util/SparseArray<", */
/* "[B>;", */
/* "Ljava/util/Map<", */
/* "Landroid/os/ParcelUuid;", */
/* "[B>;II", */
/* "Ljava/lang/String;", */
/* "[B)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.c = p2;
/* .line 4 */
this.d = p3;
/* .line 5 */
this.f = p6;
/* .line 6 */
/* iput p4, p0, Le/h/d/a/a/g/z/c;->a:I */
/* .line 7 */
/* iput p5, p0, Le/h/d/a/a/g/z/c;->e:I */
return;
} // .end method
public static Integer a ( Object[] p0, Integer p1, Integer p2, Integer p3, java.util.List p4 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([BIII", */
/* "Ljava/util/List<", */
/* "Landroid/os/ParcelUuid;", */
/* ">;)I" */
/* } */
} // .end annotation
} // :goto_0
/* if-lez p2, :cond_0 */
/* .line 27 */
e.h.d.a.a.g.z.c .a ( p0,p1,p3 );
/* .line 28 */
e.h.d.a.a.g.z.b .a ( v0 );
/* sub-int/2addr p2, p3 */
/* add-int/2addr p1, p3 */
} // :cond_0
} // .end method
public static e.h.d.a.a.g.z.c a ( Object[] p0 ) {
/* .locals 13 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p0, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
int v2 = -1; // const/4 v2, -0x1
/* .line 3 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
/* const/high16 v4, -0x80000000 */
/* .line 4 */
/* new-instance v7, Landroid/util/SparseArray; */
/* invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V */
/* .line 5 */
/* new-instance v8, Landroid/util/ArrayMap; */
/* invoke-direct {v8}, Landroid/util/ArrayMap;-><init>()V */
/* move-object v11, v0 */
int v9 = -1; // const/4 v9, -0x1
/* const/high16 v10, -0x80000000 */
/* .line 6 */
} // :goto_0
try { // :try_start_0
/* array-length v2, p0 */
/* if-ge v1, v2, :cond_4 */
/* add-int/lit8 v2, v1, 0x1 */
/* .line 7 */
/* aget-byte v1, p0, v1 */
/* const/16 v4, 0xff */
/* and-int/2addr v1, v4 */
/* if-nez v1, :cond_1 */
} // :cond_1
/* add-int/lit8 v1, v1, -0x1 */
/* add-int/lit8 v5, v2, 0x1 */
/* .line 8 */
/* aget-byte v2, p0, v2 */
/* and-int/2addr v2, v4 */
/* const/16 v6, 0x16 */
int v12 = 2; // const/4 v12, 0x2
/* if-eq v2, v6, :cond_3 */
/* if-eq v2, v4, :cond_2 */
/* packed-switch v2, :pswitch_data_0 */
/* .line 9 */
/* :pswitch_0 */
/* aget-byte v2, p0, v5 */
/* move v10, v2 */
/* .line 10 */
/* :pswitch_1 */
/* new-instance v11, Ljava/lang/String; */
/* .line 11 */
e.h.d.a.a.g.z.c .a ( p0,v5,v1 );
/* invoke-direct {v11, v2}, Ljava/lang/String;-><init>([B)V */
/* :pswitch_2 */
/* const/16 v2, 0x10 */
/* .line 12 */
e.h.d.a.a.g.z.c .a ( p0,v5,v1,v2,v3 );
/* :pswitch_3 */
int v2 = 4; // const/4 v2, 0x4
/* .line 13 */
e.h.d.a.a.g.z.c .a ( p0,v5,v1,v2,v3 );
/* .line 14 */
/* :pswitch_4 */
e.h.d.a.a.g.z.c .a ( p0,v5,v1,v12,v3 );
/* .line 15 */
/* :pswitch_5 */
/* aget-byte v2, p0, v5 */
/* and-int/2addr v2, v4 */
/* move v9, v2 */
} // :cond_2
/* add-int/lit8 v2, v5, 0x1 */
/* .line 16 */
/* aget-byte v2, p0, v2 */
/* and-int/2addr v2, v4 */
/* shl-int/lit8 v2, v2, 0x8 */
/* aget-byte v6, p0, v5 */
/* and-int/2addr v4, v6 */
/* add-int/2addr v2, v4 */
/* add-int/lit8 v4, v5, 0x2 */
/* add-int/lit8 v6, v1, -0x2 */
/* .line 17 */
e.h.d.a.a.g.z.c .a ( p0,v4,v6 );
/* .line 18 */
(( android.util.SparseArray ) v7 ).put ( v2, v4 ); // invoke-virtual {v7, v2, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
/* .line 19 */
} // :cond_3
e.h.d.a.a.g.z.c .a ( p0,v5,v12 );
/* .line 20 */
e.h.d.a.a.g.z.b .a ( v2 );
/* add-int/lit8 v4, v5, 0x2 */
/* add-int/lit8 v6, v1, -0x2 */
/* .line 21 */
e.h.d.a.a.g.z.c .a ( p0,v4,v6 );
/* .line 22 */
} // :goto_1
/* add-int/2addr v1, v5 */
/* .line 23 */
} // :cond_4
v1 = } // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_5
/* move-object v6, v0 */
} // :cond_5
/* move-object v6, v3 */
/* .line 24 */
} // :goto_3
/* new-instance v0, Le/h/d/a/a/g/z/c; */
/* move-object v5, v0 */
/* move-object v12, p0 */
/* invoke-direct/range {v5 ..v12}, Le/h/d/a/a/g/z/c;-><init>(Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 25 */
/* :catch_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "unable to parse scan record: "; // const-string v1, "unable to parse scan record: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.util.Arrays .toString ( p0 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.ScanRecord"; // const-string v1, "packid.ble.ScanRecord"
android.util.Log .e ( v1,v0 );
/* .line 26 */
/* new-instance v0, Le/h/d/a/a/g/z/c; */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = -1; // const/4 v6, -0x1
/* const/high16 v7, -0x80000000 */
int v8 = 0; // const/4 v8, 0x0
/* move-object v2, v0 */
/* move-object v9, p0 */
/* invoke-direct/range {v2 ..v9}, Le/h/d/a/a/g/z/c;-><init>(Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static a ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .line 29 */
/* new-array v0, p2, [B */
int v1 = 0; // const/4 v1, 0x0
/* .line 30 */
java.lang.System .arraycopy ( p0,p1,v0,v1,p2 );
} // .end method
/* # virtual methods */
public android.util.SparseArray a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Landroid/util/SparseArray<", */
/* "[B>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
} // .end method
public a ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.c;
(( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast p1, [B */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "ScanRecord [mAdvertiseFlags="; // const-string v1, "ScanRecord [mAdvertiseFlags="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/h/d/a/a/g/z/c;->a:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mServiceUuids="; // const-string v1, ", mServiceUuids="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", mManufacturerSpecificData="; // const-string v1, ", mManufacturerSpecificData="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
/* .line 2 */
e.h.d.a.a.g.z.a .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", mServiceData="; // const-string v1, ", mServiceData="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
/* .line 3 */
e.h.d.a.a.g.z.a .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", mTxPowerLevel="; // const-string v1, ", mTxPowerLevel="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/h/d/a/a/g/z/c;->e:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", mDeviceName="; // const-string v1, ", mDeviceName="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.f;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
