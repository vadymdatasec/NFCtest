.class public abstract Le/f/a/a/j/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f/a/a/j/x$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Le/f/a/a/j/x$a;
    .locals 2

    .line 1
    new-instance v0, Le/f/a/a/j/h;

    invoke-direct {v0}, Le/f/a/a/j/h;-><init>()V

    sget-object v1, Le/f/a/a/d;->b:Le/f/a/a/d;

    invoke-virtual {v0, v1}, Le/f/a/a/j/h;->a(Le/f/a/a/d;)Le/f/a/a/j/x$a;

    return-object v0
.end method


# virtual methods
.method public a(Le/f/a/a/d;)Le/f/a/a/j/x;
    .locals 2

    .line 1
    invoke-static {}, Le/f/a/a/j/x;->d()Le/f/a/a/j/x$a;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Le/f/a/a/j/x;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/a/j/x$a;->a(Ljava/lang/String;)Le/f/a/a/j/x$a;

    .line 3
    invoke-virtual {v0, p1}, Le/f/a/a/j/x$a;->a(Le/f/a/a/d;)Le/f/a/a/j/x$a;

    .line 4
    invoke-virtual {p0}, Le/f/a/a/j/x;->b()[B

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/a/a/j/x$a;->a([B)Le/f/a/a/j/x$a;

    .line 5
    invoke-virtual {v0}, Le/f/a/a/j/x$a;->a()Le/f/a/a/j/x;

    move-result-object p1

    return-object p1
.end method

.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()[B
.end method

.method public abstract c()Le/f/a/a/d;
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    invoke-virtual {p0}, Le/f/a/a/j/x;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 2
    invoke-virtual {p0}, Le/f/a/a/j/x;->c()Le/f/a/a/d;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 3
    invoke-virtual {p0}, Le/f/a/a/j/x;->b()[B

    move-result-object v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Le/f/a/a/j/x;->b()[B

    move-result-object v1

    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    :goto_0
    aput-object v1, v0, v2

    const-string v1, "TransportContext(%s, %s, %s)"

    .line 4
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
