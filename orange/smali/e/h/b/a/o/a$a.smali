.class public final enum Le/h/b/a/o/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/h/b/a/o/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/b/a/o/a$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/h/b/a/o/a$a;

.field public static final enum c:Le/h/b/a/o/a$a;

.field public static final enum d:Le/h/b/a/o/a$a;

.field public static final enum e:Le/h/b/a/o/a$a;

.field public static final enum f:Le/h/b/a/o/a$a;

.field public static final synthetic g:[Le/h/b/a/o/a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Le/h/b/a/o/a$a;

    const/4 v1, 0x0

    const-string v2, "BLUETOOTH"

    invoke-direct {v0, v2, v1}, Le/h/b/a/o/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/b/a/o/a$a;->b:Le/h/b/a/o/a$a;

    new-instance v0, Le/h/b/a/o/a$a;

    const/4 v2, 0x1

    const-string v3, "LOCALIZATION"

    invoke-direct {v0, v3, v2}, Le/h/b/a/o/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/b/a/o/a$a;->c:Le/h/b/a/o/a$a;

    new-instance v0, Le/h/b/a/o/a$a;

    const/4 v3, 0x2

    const-string v4, "GPS"

    invoke-direct {v0, v4, v3}, Le/h/b/a/o/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/b/a/o/a$a;->d:Le/h/b/a/o/a$a;

    new-instance v0, Le/h/b/a/o/a$a;

    const/4 v4, 0x3

    const-string v5, "DOZEMODE"

    invoke-direct {v0, v5, v4}, Le/h/b/a/o/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/b/a/o/a$a;->e:Le/h/b/a/o/a$a;

    new-instance v0, Le/h/b/a/o/a$a;

    const/4 v5, 0x4

    const-string v6, "BLUETOOTH_SCAN"

    invoke-direct {v0, v6, v5}, Le/h/b/a/o/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/b/a/o/a$a;->f:Le/h/b/a/o/a$a;

    const/4 v6, 0x5

    new-array v6, v6, [Le/h/b/a/o/a$a;

    sget-object v7, Le/h/b/a/o/a$a;->b:Le/h/b/a/o/a$a;

    aput-object v7, v6, v1

    sget-object v1, Le/h/b/a/o/a$a;->c:Le/h/b/a/o/a$a;

    aput-object v1, v6, v2

    sget-object v1, Le/h/b/a/o/a$a;->d:Le/h/b/a/o/a$a;

    aput-object v1, v6, v3

    sget-object v1, Le/h/b/a/o/a$a;->e:Le/h/b/a/o/a$a;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Le/h/b/a/o/a$a;->g:[Le/h/b/a/o/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/h/b/a/o/a$a;
    .locals 1

    .line 1
    const-class v0, Le/h/b/a/o/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/b/a/o/a$a;

    return-object p0
.end method

.method public static values()[Le/h/b/a/o/a$a;
    .locals 1

    .line 1
    sget-object v0, Le/h/b/a/o/a$a;->g:[Le/h/b/a/o/a$a;

    invoke-virtual {v0}, [Le/h/b/a/o/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/b/a/o/a$a;

    return-object v0
.end method
