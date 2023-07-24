.class public final enum Le/f/c/l/e/m/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/c/l/e/m/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/c/l/e/m/i;

.field public static final enum c:Le/f/c/l/e/m/i;

.field public static final enum d:Le/f/c/l/e/m/i;

.field public static final enum e:Le/f/c/l/e/m/i;

.field public static final enum f:Le/f/c/l/e/m/i;

.field public static final enum g:Le/f/c/l/e/m/i;

.field public static final enum h:Le/f/c/l/e/m/i;

.field public static final enum i:Le/f/c/l/e/m/i;

.field public static final enum j:Le/f/c/l/e/m/i;

.field public static final enum k:Le/f/c/l/e/m/i;

.field public static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Le/f/c/l/e/m/i;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic m:[Le/f/c/l/e/m/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Le/f/c/l/e/m/i;

    const/4 v1, 0x0

    const-string v2, "X86_32"

    invoke-direct {v0, v2, v1}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->b:Le/f/c/l/e/m/i;

    .line 2
    new-instance v0, Le/f/c/l/e/m/i;

    const/4 v2, 0x1

    const-string v3, "X86_64"

    invoke-direct {v0, v3, v2}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->c:Le/f/c/l/e/m/i;

    .line 3
    new-instance v0, Le/f/c/l/e/m/i;

    const/4 v3, 0x2

    const-string v4, "ARM_UNKNOWN"

    invoke-direct {v0, v4, v3}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->d:Le/f/c/l/e/m/i;

    .line 4
    new-instance v0, Le/f/c/l/e/m/i;

    const/4 v4, 0x3

    const-string v5, "PPC"

    invoke-direct {v0, v5, v4}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->e:Le/f/c/l/e/m/i;

    .line 5
    new-instance v0, Le/f/c/l/e/m/i;

    const/4 v5, 0x4

    const-string v6, "PPC64"

    invoke-direct {v0, v6, v5}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->f:Le/f/c/l/e/m/i;

    .line 6
    new-instance v0, Le/f/c/l/e/m/i;

    const/4 v6, 0x5

    const-string v7, "ARMV6"

    invoke-direct {v0, v7, v6}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->g:Le/f/c/l/e/m/i;

    .line 7
    new-instance v0, Le/f/c/l/e/m/i;

    const/4 v7, 0x6

    const-string v8, "ARMV7"

    invoke-direct {v0, v8, v7}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->h:Le/f/c/l/e/m/i;

    .line 8
    new-instance v0, Le/f/c/l/e/m/i;

    const/4 v8, 0x7

    const-string v9, "UNKNOWN"

    invoke-direct {v0, v9, v8}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->i:Le/f/c/l/e/m/i;

    .line 9
    new-instance v0, Le/f/c/l/e/m/i;

    const/16 v9, 0x8

    const-string v10, "ARMV7S"

    invoke-direct {v0, v10, v9}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->j:Le/f/c/l/e/m/i;

    .line 10
    new-instance v0, Le/f/c/l/e/m/i;

    const/16 v10, 0x9

    const-string v11, "ARM64"

    invoke-direct {v0, v11, v10}, Le/f/c/l/e/m/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/i;->k:Le/f/c/l/e/m/i;

    const/16 v11, 0xa

    new-array v11, v11, [Le/f/c/l/e/m/i;

    .line 11
    sget-object v12, Le/f/c/l/e/m/i;->b:Le/f/c/l/e/m/i;

    aput-object v12, v11, v1

    sget-object v1, Le/f/c/l/e/m/i;->c:Le/f/c/l/e/m/i;

    aput-object v1, v11, v2

    sget-object v1, Le/f/c/l/e/m/i;->d:Le/f/c/l/e/m/i;

    aput-object v1, v11, v3

    sget-object v1, Le/f/c/l/e/m/i;->e:Le/f/c/l/e/m/i;

    aput-object v1, v11, v4

    sget-object v1, Le/f/c/l/e/m/i;->f:Le/f/c/l/e/m/i;

    aput-object v1, v11, v5

    sget-object v1, Le/f/c/l/e/m/i;->g:Le/f/c/l/e/m/i;

    aput-object v1, v11, v6

    sget-object v1, Le/f/c/l/e/m/i;->h:Le/f/c/l/e/m/i;

    aput-object v1, v11, v7

    sget-object v1, Le/f/c/l/e/m/i;->i:Le/f/c/l/e/m/i;

    aput-object v1, v11, v8

    sget-object v1, Le/f/c/l/e/m/i;->j:Le/f/c/l/e/m/i;

    aput-object v1, v11, v9

    aput-object v0, v11, v10

    sput-object v11, Le/f/c/l/e/m/i;->m:[Le/f/c/l/e/m/i;

    .line 12
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v5}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Le/f/c/l/e/m/i;->l:Ljava/util/Map;

    .line 13
    sget-object v1, Le/f/c/l/e/m/i;->h:Le/f/c/l/e/m/i;

    const-string v2, "armeabi-v7a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    sget-object v0, Le/f/c/l/e/m/i;->l:Ljava/util/Map;

    sget-object v1, Le/f/c/l/e/m/i;->g:Le/f/c/l/e/m/i;

    const-string v2, "armeabi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    sget-object v0, Le/f/c/l/e/m/i;->l:Ljava/util/Map;

    sget-object v1, Le/f/c/l/e/m/i;->k:Le/f/c/l/e/m/i;

    const-string v2, "arm64-v8a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    sget-object v0, Le/f/c/l/e/m/i;->l:Ljava/util/Map;

    sget-object v1, Le/f/c/l/e/m/i;->b:Le/f/c/l/e/m/i;

    const-string v2, "x86"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public static a()Le/f/c/l/e/m/i;
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Architecture#getValue()::Build.CPU_ABI returned null or empty"

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 4
    sget-object v0, Le/f/c/l/e/m/i;->i:Le/f/c/l/e/m/i;

    return-object v0

    .line 5
    :cond_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v1, Le/f/c/l/e/m/i;->l:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/c/l/e/m/i;

    if-nez v0, :cond_1

    .line 7
    sget-object v0, Le/f/c/l/e/m/i;->i:Le/f/c/l/e/m/i;

    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le/f/c/l/e/m/i;
    .locals 1

    .line 1
    const-class v0, Le/f/c/l/e/m/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/c/l/e/m/i;

    return-object p0
.end method

.method public static values()[Le/f/c/l/e/m/i;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/m/i;->m:[Le/f/c/l/e/m/i;

    invoke-virtual {v0}, [Le/f/c/l/e/m/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/c/l/e/m/i;

    return-object v0
.end method
