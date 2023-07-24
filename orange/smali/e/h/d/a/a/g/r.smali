.class public Le/h/d/a/a/g/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Le/h/d/a/a/g/r;

.field public static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lfr/mbs/binary/Octets;",
            "Le/h/d/a/a/g/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Le/h/d/a/a/g/r;->b:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/h/d/a/a/g/r;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/g/r;->a:Le/h/d/a/a/g/r;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Le/h/d/a/a/g/r;

    invoke-direct {v0}, Le/h/d/a/a/g/r;-><init>()V

    sput-object v0, Le/h/d/a/a/g/r;->a:Le/h/d/a/a/g/r;

    .line 3
    :cond_0
    sget-object v0, Le/h/d/a/a/g/r;->a:Le/h/d/a/a/g/r;

    return-object v0
.end method

.method public static a(Lfr/mbs/binary/Octets;Le/h/d/a/a/g/x;)V
    .locals 1

    .line 18
    sget-object v0, Le/h/d/a/a/g/r;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    sget-object v0, Le/h/d/a/a/g/r;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    :cond_0
    sget-object v0, Le/h/d/a/a/g/r;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/bluetooth/BluetoothDevice;Lfr/mbs/binary/Octets;I)Z
    .locals 6

    .line 4
    new-instance v0, Le/h/d/a/a/g/x;

    invoke-direct {v0, p0, p1, p2}, Le/h/d/a/a/g/x;-><init>(Landroid/bluetooth/BluetoothDevice;Lfr/mbs/binary/Octets;I)V

    .line 5
    sget-object p0, Le/h/d/a/a/g/r;->b:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    const/4 p2, 0x1

    if-eqz p0, :cond_3

    .line 6
    sget-object p0, Le/h/d/a/a/g/r;->b:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le/h/d/a/a/g/x;

    .line 7
    invoke-virtual {v0}, Le/h/d/a/a/g/x;->b()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p0, v1}, Le/h/d/a/a/g/x;->a(Ljava/util/Date;)Z

    move-result v1

    const/4 v2, 0x2

    const-string v3, "KnownReadersManager"

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    .line 8
    invoke-static {p1, v0}, Le/h/d/a/a/g/r;->a(Lfr/mbs/binary/Octets;Le/h/d/a/a/g/x;)V

    new-array p1, v2, [Ljava/lang/Object;

    .line 9
    invoke-virtual {p0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, v4

    invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, p2

    const-string p0, "knownReader : %s newReader : %s Date Expired"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return p2

    .line 10
    :cond_0
    invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 11
    invoke-static {p1, v0}, Le/h/d/a/a/g/r;->a(Lfr/mbs/binary/Octets;Le/h/d/a/a/g/x;)V

    new-array p1, v2, [Ljava/lang/Object;

    .line 12
    invoke-virtual {p0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, v4

    invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, p2

    const-string p0, "knownReader : %s newReader : %s Same Reader"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return p2

    .line 13
    :cond_1
    invoke-virtual {v0}, Le/h/d/a/a/g/x;->c()I

    move-result v1

    invoke-virtual {p0}, Le/h/d/a/a/g/x;->c()I

    move-result v5

    if-le v1, v5, :cond_2

    .line 14
    invoke-static {p1, v0}, Le/h/d/a/a/g/r;->a(Lfr/mbs/binary/Octets;Le/h/d/a/a/g/x;)V

    new-array p1, v2, [Ljava/lang/Object;

    .line 15
    invoke-virtual {p0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, v4

    invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, p2

    const-string p0, "knownReader : %s newReader : %s New Reader better signal"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return p2

    :cond_2
    new-array p0, p2, [Ljava/lang/Object;

    .line 16
    invoke-virtual {v0}, Le/h/d/a/a/g/x;->a()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p0, v4

    const-string p1, "ignoring advertising from %s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v4

    .line 17
    :cond_3
    invoke-static {p1, v0}, Le/h/d/a/a/g/r;->a(Lfr/mbs/binary/Octets;Le/h/d/a/a/g/x;)V

    return p2
.end method
