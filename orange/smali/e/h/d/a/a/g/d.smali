.class public Le/h/d/a/a/g/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/h/d/a/a/g/z/c;


# direct methods
.method public constructor <init>(Le/h/d/a/a/g/z/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/g/d;->a:Le/h/d/a/a/g/z/c;

    return-void
.end method

.method public static a([B)Le/h/d/a/a/g/d;
    .locals 1

    .line 1
    new-instance v0, Le/h/d/a/a/g/d;

    invoke-static {p0}, Le/h/d/a/a/g/z/c;->a([B)Le/h/d/a/a/g/z/c;

    move-result-object p0

    invoke-direct {v0, p0}, Le/h/d/a/a/g/d;-><init>(Le/h/d/a/a/g/z/c;)V

    return-object v0
.end method


# virtual methods
.method public a(I)Lfr/mbs/binary/Octets;
    .locals 2

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/d;->b(I)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    .line 4
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error while getting manufacturer specific data "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Le/h/d/a/a/g/d;->a:Le/h/d/a/a/g/z/c;

    invoke-virtual {v0}, Le/h/d/a/a/g/z/c;->a()Landroid/util/SparseArray;

    move-result-object v0

    invoke-static {v0}, Le/h/d/a/a/g/z/a;->a(Landroid/util/SparseArray;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "packid.ble.AdvertisData"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/d;->a:Le/h/d/a/a/g/z/c;

    invoke-virtual {v0, p1}, Le/h/d/a/a/g/z/c;->a(I)[B

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "manufacturerId not found in scan record"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(I)Lfr/mbs/binary/Octets;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/d;->b(I)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    .line 3
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error while getting zoneid from manufacturer specific data "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Le/h/d/a/a/g/d;->a:Le/h/d/a/a/g/z/c;

    invoke-virtual {v0}, Le/h/d/a/a/g/z/c;->a()Landroid/util/SparseArray;

    move-result-object v0

    invoke-static {v0}, Le/h/d/a/a/g/z/a;->a(Landroid/util/SparseArray;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "packid.ble.AdvertisData"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method
