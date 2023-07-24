.class public final enum Le/h/d/a/a/g/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/d/a/a/g/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/h/d/a/a/g/m;

.field public static final enum d:Le/h/d/a/a/g/m;

.field public static final synthetic e:[Le/h/d/a/a/g/m;


# instance fields
.field public final b:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le/h/d/a/a/g/m;

    const-class v1, Landroid/bluetooth/BluetoothGatt;

    const/4 v2, 0x0

    const-string v3, "GATT"

    invoke-direct {v0, v3, v2, v1}, Le/h/d/a/a/g/m;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Le/h/d/a/a/g/m;->c:Le/h/d/a/a/g/m;

    new-instance v0, Le/h/d/a/a/g/m;

    const-class v1, Landroid/bluetooth/BluetoothProfile;

    const/4 v3, 0x1

    const-string v4, "STATE"

    invoke-direct {v0, v4, v3, v1}, Le/h/d/a/a/g/m;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Le/h/d/a/a/g/m;->d:Le/h/d/a/a/g/m;

    new-instance v0, Le/h/d/a/a/g/m;

    const-class v1, Landroid/bluetooth/le/ScanSettings;

    const/4 v4, 0x2

    const-string v5, "SCAN_MODE"

    invoke-direct {v0, v5, v4, v1}, Le/h/d/a/a/g/m;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    const/4 v1, 0x3

    new-array v1, v1, [Le/h/d/a/a/g/m;

    .line 2
    sget-object v5, Le/h/d/a/a/g/m;->c:Le/h/d/a/a/g/m;

    aput-object v5, v1, v2

    sget-object v2, Le/h/d/a/a/g/m;->d:Le/h/d/a/a/g/m;

    aput-object v2, v1, v3

    aput-object v0, v1, v4

    sput-object v1, Le/h/d/a/a/g/m;->e:[Le/h/d/a/a/g/m;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Le/h/d/a/a/g/m;->b:Ljava/lang/Class;

    return-void
.end method

.method public static synthetic a(Le/h/d/a/a/g/m;)Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Le/h/d/a/a/g/m;->b:Ljava/lang/Class;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Le/h/d/a/a/g/m;
    .locals 1

    .line 1
    const-class v0, Le/h/d/a/a/g/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/d/a/a/g/m;

    return-object p0
.end method

.method public static values()[Le/h/d/a/a/g/m;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/g/m;->e:[Le/h/d/a/a/g/m;

    invoke-virtual {v0}, [Le/h/d/a/a/g/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/d/a/a/g/m;

    return-object v0
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    .line 2
    invoke-static {}, Le/h/d/a/a/g/n;->a()Ljava/util/EnumMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/g/m;->b:Ljava/lang/Class;

    const-class v1, Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x85

    if-ne p1, v0, :cond_1

    const-string p1, "GATT_ERROR"

    return-object p1

    .line 6
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown value "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
