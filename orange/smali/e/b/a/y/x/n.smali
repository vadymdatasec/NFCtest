.class public abstract synthetic Le/b/a/y/x/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I

.field public static final synthetic c:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    invoke-static {}, Le/b/a/y/c;->values()[Le/b/a/y/c;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Le/b/a/y/x/n;->c:[I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Le/b/a/y/c;->b:Le/b/a/y/c;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x2

    :try_start_1
    sget-object v2, Le/b/a/y/x/n;->c:[I

    sget-object v3, Le/b/a/y/c;->c:Le/b/a/y/c;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 2
    :catch_1
    invoke-static {}, Le/b/a/y/x/u;->values()[Le/b/a/y/x/u;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [I

    sput-object v2, Le/b/a/y/x/n;->b:[I

    :try_start_2
    sget-object v3, Le/b/a/y/x/u;->c:Le/b/a/y/x/u;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v2, Le/b/a/y/x/n;->b:[I

    sget-object v3, Le/b/a/y/x/u;->d:Le/b/a/y/x/u;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    const/4 v2, 0x3

    :try_start_4
    sget-object v3, Le/b/a/y/x/n;->b:[I

    sget-object v4, Le/b/a/y/x/u;->e:Le/b/a/y/x/u;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v2, v3, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v3, Le/b/a/y/x/n;->b:[I

    sget-object v4, Le/b/a/y/x/u;->g:Le/b/a/y/x/u;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x4

    aput v5, v3, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v3, Le/b/a/y/x/n;->b:[I

    sget-object v4, Le/b/a/y/x/u;->b:Le/b/a/y/x/u;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x5

    aput v5, v3, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 3
    :catch_6
    invoke-static {}, Le/b/a/y/x/t;->values()[Le/b/a/y/x/t;

    move-result-object v3

    array-length v3, v3

    new-array v3, v3, [I

    sput-object v3, Le/b/a/y/x/n;->a:[I

    :try_start_7
    sget-object v4, Le/b/a/y/x/t;->b:Le/b/a/y/x/t;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v3, v4
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v1, Le/b/a/y/x/n;->a:[I

    sget-object v3, Le/b/a/y/x/t;->c:Le/b/a/y/x/t;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v1, v3
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v0, Le/b/a/y/x/n;->a:[I

    sget-object v1, Le/b/a/y/x/t;->d:Le/b/a/y/x/t;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    return-void
.end method
