.class public abstract synthetic Lm/b/i/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lm/b/i/n;->values()[Lm/b/i/n;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lm/b/i/m;->a:[I

    :try_start_0
    sget-object v1, Lm/b/i/n;->b:Lm/b/i/n;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lm/b/i/m;->a:[I

    sget-object v1, Lm/b/i/n;->c:Lm/b/i/n;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
