.class public final enum Le/h/b/a/p/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/b/a/p/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Le/h/b/a/p/i;

.field public static final synthetic f:[Le/h/b/a/p/i;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v7, Le/h/b/a/p/i;

    const-string v1, "RFIDEAS"

    const/4 v2, 0x0

    const-string v3, "RFID"

    const-string v4, "rf IDEAS"

    const-string v5, "Acc\u00e8s de test"

    const v6, 0x7f0700d3

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Le/h/b/a/p/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v7, Le/h/b/a/p/i;->e:Le/h/b/a/p/i;

    const/4 v0, 0x1

    new-array v0, v0, [Le/h/b/a/p/i;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    .line 2
    sput-object v0, Le/h/b/a/p/i;->f:[Le/h/b/a/p/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Le/h/b/a/p/i;->b:Ljava/lang/String;

    .line 3
    iput-object p4, p0, Le/h/b/a/p/i;->c:Ljava/lang/String;

    .line 4
    iput p6, p0, Le/h/b/a/p/i;->d:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Le/h/b/a/p/i;
    .locals 5

    .line 1
    invoke-static {}, Le/h/b/a/p/i;->values()[Le/h/b/a/p/i;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    invoke-virtual {v3}, Le/h/b/a/p/i;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 1
    invoke-static {p0}, Le/h/b/a/p/i;->a(Ljava/lang/String;)Le/h/b/a/p/i;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static c(Ljava/lang/String;)Le/h/b/a/p/i;
    .locals 0

    .line 1
    invoke-static {p0}, Le/h/b/a/p/i;->a(Ljava/lang/String;)Le/h/b/a/p/i;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Le/h/b/a/p/i;
    .locals 1

    .line 1
    const-class v0, Le/h/b/a/p/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/b/a/p/i;

    return-object p0
.end method

.method public static values()[Le/h/b/a/p/i;
    .locals 1

    .line 1
    sget-object v0, Le/h/b/a/p/i;->f:[Le/h/b/a/p/i;

    invoke-virtual {v0}, [Le/h/b/a/p/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/b/a/p/i;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 3
    iget v0, p0, Le/h/b/a/p/i;->d:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Le/h/b/a/p/i;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Le/h/b/a/p/i;->c:Ljava/lang/String;

    return-object v0
.end method
