.class public final Le/f/d/d0/g0/v;
.super Le/f/d/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/d/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Le/f/d/q;

.field public final b:Le/f/d/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Le/f/d/q;Le/f/d/a0;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/q;",
            "Le/f/d/a0<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/f/d/a0;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/d/d0/g0/v;->a:Le/f/d/q;

    .line 3
    iput-object p2, p0, Le/f/d/d0/g0/v;->b:Le/f/d/a0;

    .line 4
    iput-object p3, p0, Le/f/d/d0/g0/v;->c:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public a(Le/f/d/f0/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/f0/c;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/g0/v;->b:Le/f/d/a0;

    invoke-virtual {v0, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;
    .locals 1

    if-eqz p2, :cond_1

    .line 9
    const-class v0, Ljava/lang/Object;

    if-eq p1, v0, :cond_0

    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 10
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public a(Le/f/d/f0/g;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/f0/g;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/d/d0/g0/v;->b:Le/f/d/a0;

    .line 3
    iget-object v1, p0, Le/f/d/d0/g0/v;->c:Ljava/lang/reflect/Type;

    invoke-virtual {p0, v1, p2}, Le/f/d/d0/g0/v;->a(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/reflect/Type;

    move-result-object v1

    .line 4
    iget-object v2, p0, Le/f/d/d0/g0/v;->c:Ljava/lang/reflect/Type;

    if-eq v1, v2, :cond_1

    .line 5
    iget-object v0, p0, Le/f/d/d0/g0/v;->a:Le/f/d/q;

    invoke-static {v1}, Le/f/d/e0/a;->a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object v0

    .line 6
    instance-of v1, v0, Le/f/d/d0/g0/o;

    if-nez v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, p0, Le/f/d/d0/g0/v;->b:Le/f/d/a0;

    instance-of v2, v1, Le/f/d/d0/g0/o;

    if-nez v2, :cond_1

    move-object v0, v1

    .line 8
    :cond_1
    :goto_0
    invoke-virtual {v0, p1, p2}, Le/f/d/a0;->a(Le/f/d/f0/g;Ljava/lang/Object;)V

    return-void
.end method
