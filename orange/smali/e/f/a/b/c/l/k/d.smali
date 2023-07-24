.class public final Le/f/a/b/c/l/k/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/a/b/c/l/k/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/c/l/k/a0<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Le/f/a/b/c/c;


# direct methods
.method public constructor <init>(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/k/a0<",
            "*>;",
            "Le/f/a/b/c/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/b/c/l/k/d;->a:Le/f/a/b/c/l/k/a0;

    .line 3
    iput-object p2, p0, Le/f/a/b/c/l/k/d;->b:Le/f/a/b/c/c;

    return-void
.end method

.method public synthetic constructor <init>(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/c;Le/f/a/b/c/l/k/p;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Le/f/a/b/c/l/k/d;-><init>(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/c;)V

    return-void
.end method

.method public static synthetic a(Le/f/a/b/c/l/k/d;)Le/f/a/b/c/l/k/a0;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/a/b/c/l/k/d;->a:Le/f/a/b/c/l/k/a0;

    return-object p0
.end method

.method public static synthetic b(Le/f/a/b/c/l/k/d;)Le/f/a/b/c/c;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/a/b/c/l/k/d;->b:Le/f/a/b/c/c;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 1
    instance-of v1, p1, Le/f/a/b/c/l/k/d;

    if-eqz v1, :cond_0

    .line 2
    check-cast p1, Le/f/a/b/c/l/k/d;

    .line 3
    iget-object v1, p0, Le/f/a/b/c/l/k/d;->a:Le/f/a/b/c/l/k/a0;

    iget-object v2, p1, Le/f/a/b/c/l/k/d;->a:Le/f/a/b/c/l/k/a0;

    invoke-static {v1, v2}, Le/f/a/b/c/m/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/f/a/b/c/l/k/d;->b:Le/f/a/b/c/c;

    iget-object p1, p1, Le/f/a/b/c/l/k/d;->b:Le/f/a/b/c/c;

    .line 4
    invoke-static {v1, p1}, Le/f/a/b/c/m/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    .line 1
    iget-object v1, p0, Le/f/a/b/c/l/k/d;->a:Le/f/a/b/c/l/k/a0;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Le/f/a/b/c/l/k/d;->b:Le/f/a/b/c/c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Le/f/a/b/c/m/g;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Le/f/a/b/c/m/g;->a(Ljava/lang/Object;)Le/f/a/b/c/m/f;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/d;->a:Le/f/a/b/c/l/k/a0;

    const-string v2, "key"

    invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;

    iget-object v1, p0, Le/f/a/b/c/l/k/d;->b:Le/f/a/b/c/c;

    const-string v2, "feature"

    invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;

    invoke-virtual {v0}, Le/f/a/b/c/m/f;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
