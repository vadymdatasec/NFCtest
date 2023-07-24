.class public final Le/h/d/a/a/g/z/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/os/ParcelUuid;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "[B>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/os/ParcelUuid;",
            "[B>;"
        }
    .end annotation
.end field

.field public final e:I

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/ParcelUuid;",
            ">;",
            "Landroid/util/SparseArray<",
            "[B>;",
            "Ljava/util/Map<",
            "Landroid/os/ParcelUuid;",
            "[B>;II",
            "Ljava/lang/String;",
            "[B)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/g/z/c;->b:Ljava/util/List;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/g/z/c;->c:Landroid/util/SparseArray;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/g/z/c;->d:Ljava/util/Map;

    .line 5
    iput-object p6, p0, Le/h/d/a/a/g/z/c;->f:Ljava/lang/String;

    .line 6
    iput p4, p0, Le/h/d/a/a/g/z/c;->a:I

    .line 7
    iput p5, p0, Le/h/d/a/a/g/z/c;->e:I

    return-void
.end method

.method public static a([BIIILjava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BIII",
            "Ljava/util/List<",
            "Landroid/os/ParcelUuid;",
            ">;)I"
        }
    .end annotation

    :goto_0
    if-lez p2, :cond_0

    .line 27
    invoke-static {p0, p1, p3}, Le/h/d/a/a/g/z/c;->a([BII)[B

    move-result-object v0

    .line 28
    invoke-static {v0}, Le/h/d/a/a/g/z/b;->a([B)Landroid/os/ParcelUuid;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sub-int/2addr p2, p3

    add-int/2addr p1, p3

    goto :goto_0

    :cond_0
    return p1
.end method

.method public static a([B)Le/h/d/a/a/g/z/c;
    .locals 13

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 3
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/high16 v4, -0x80000000

    .line 4
    new-instance v7, Landroid/util/SparseArray;

    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    .line 5
    new-instance v8, Landroid/util/ArrayMap;

    invoke-direct {v8}, Landroid/util/ArrayMap;-><init>()V

    move-object v11, v0

    const/4 v9, -0x1

    const/high16 v10, -0x80000000

    .line 6
    :goto_0
    :try_start_0
    array-length v2, p0

    if-ge v1, v2, :cond_4

    add-int/lit8 v2, v1, 0x1

    .line 7
    aget-byte v1, p0, v1

    const/16 v4, 0xff

    and-int/2addr v1, v4

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, -0x1

    add-int/lit8 v5, v2, 0x1

    .line 8
    aget-byte v2, p0, v2

    and-int/2addr v2, v4

    const/16 v6, 0x16

    const/4 v12, 0x2

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 9
    :pswitch_0
    aget-byte v2, p0, v5

    move v10, v2

    goto :goto_1

    .line 10
    :pswitch_1
    new-instance v11, Ljava/lang/String;

    .line 11
    invoke-static {p0, v5, v1}, Le/h/d/a/a/g/z/c;->a([BII)[B

    move-result-object v2

    invoke-direct {v11, v2}, Ljava/lang/String;-><init>([B)V

    goto :goto_1

    :pswitch_2
    const/16 v2, 0x10

    .line 12
    invoke-static {p0, v5, v1, v2, v3}, Le/h/d/a/a/g/z/c;->a([BIIILjava/util/List;)I

    goto :goto_1

    :pswitch_3
    const/4 v2, 0x4

    .line 13
    invoke-static {p0, v5, v1, v2, v3}, Le/h/d/a/a/g/z/c;->a([BIIILjava/util/List;)I

    goto :goto_1

    .line 14
    :pswitch_4
    invoke-static {p0, v5, v1, v12, v3}, Le/h/d/a/a/g/z/c;->a([BIIILjava/util/List;)I

    goto :goto_1

    .line 15
    :pswitch_5
    aget-byte v2, p0, v5

    and-int/2addr v2, v4

    move v9, v2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v5, 0x1

    .line 16
    aget-byte v2, p0, v2

    and-int/2addr v2, v4

    shl-int/lit8 v2, v2, 0x8

    aget-byte v6, p0, v5

    and-int/2addr v4, v6

    add-int/2addr v2, v4

    add-int/lit8 v4, v5, 0x2

    add-int/lit8 v6, v1, -0x2

    .line 17
    invoke-static {p0, v4, v6}, Le/h/d/a/a/g/z/c;->a([BII)[B

    move-result-object v4

    .line 18
    invoke-virtual {v7, v2, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    .line 19
    :cond_3
    invoke-static {p0, v5, v12}, Le/h/d/a/a/g/z/c;->a([BII)[B

    move-result-object v2

    .line 20
    invoke-static {v2}, Le/h/d/a/a/g/z/b;->a([B)Landroid/os/ParcelUuid;

    move-result-object v2

    add-int/lit8 v4, v5, 0x2

    add-int/lit8 v6, v1, -0x2

    .line 21
    invoke-static {p0, v4, v6}, Le/h/d/a/a/g/z/c;->a([BII)[B

    move-result-object v4

    .line 22
    invoke-interface {v8, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/2addr v1, v5

    goto :goto_0

    .line 23
    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    move-object v6, v0

    goto :goto_3

    :cond_5
    move-object v6, v3

    .line 24
    :goto_3
    new-instance v0, Le/h/d/a/a/g/z/c;

    move-object v5, v0

    move-object v12, p0

    invoke-direct/range {v5 .. v12}, Le/h/d/a/a/g/z/c;-><init>(Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 25
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unable to parse scan record: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.ScanRecord"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    new-instance v0, Le/h/d/a/a/g/z/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/high16 v7, -0x80000000

    const/4 v8, 0x0

    move-object v2, v0

    move-object v9, p0

    invoke-direct/range {v2 .. v9}, Le/h/d/a/a/g/z/c;-><init>(Ljava/util/List;Landroid/util/SparseArray;Ljava/util/Map;IILjava/lang/String;[B)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static a([BII)[B
    .locals 2

    .line 29
    new-array v0, p2, [B

    const/4 v1, 0x0

    .line 30
    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "[B>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/z/c;->c:Landroid/util/SparseArray;

    return-object v0
.end method

.method public a(I)[B
    .locals 1

    .line 2
    iget-object v0, p0, Le/h/d/a/a/g/z/c;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ScanRecord [mAdvertiseFlags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/h/d/a/a/g/z/c;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mServiceUuids="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/g/z/c;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mManufacturerSpecificData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/g/z/c;->c:Landroid/util/SparseArray;

    .line 2
    invoke-static {v1}, Le/h/d/a/a/g/z/a;->a(Landroid/util/SparseArray;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mServiceData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/g/z/c;->d:Ljava/util/Map;

    .line 3
    invoke-static {v1}, Le/h/d/a/a/g/z/a;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mTxPowerLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/h/d/a/a/g/z/c;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDeviceName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/g/z/c;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
