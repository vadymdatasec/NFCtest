.class public final Le/f/b/b/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/b/b/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/f/b/b/s<",
        "TK;TV;",
        "Le/f/b/b/j0<",
        "TK;TV;>;",
        "Le/f/b/b/k0<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final a:Le/f/b/b/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/i0<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/b/b/i0;

    invoke-direct {v0}, Le/f/b/b/i0;-><init>()V

    sput-object v0, Le/f/b/b/i0;->a:Le/f/b/b/i0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Le/f/b/b/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Le/f/b/b/i0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/b/b/i0;->a:Le/f/b/b/i0;

    return-object v0
.end method


# virtual methods
.method public a(Le/f/b/b/k0;Le/f/b/b/j0;Le/f/b/b/j0;)Le/f/b/b/j0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/k0<",
            "TK;TV;>;",
            "Le/f/b/b/j0<",
            "TK;TV;>;",
            "Le/f/b/b/j0<",
            "TK;TV;>;)",
            "Le/f/b/b/j0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 7
    invoke-virtual {p2}, Le/f/b/b/o;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 8
    :cond_0
    invoke-static {p2}, Le/f/b/b/u;->b(Le/f/b/b/r;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    .line 9
    :cond_1
    invoke-static {p1}, Le/f/b/b/k0;->a(Le/f/b/b/k0;)Ljava/lang/ref/ReferenceQueue;

    move-result-object v0

    invoke-static {p1}, Le/f/b/b/k0;->b(Le/f/b/b/k0;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-virtual {p2, v0, p1, p3}, Le/f/b/b/j0;->a(Ljava/lang/ref/ReferenceQueue;Ljava/lang/ref/ReferenceQueue;Le/f/b/b/j0;)Le/f/b/b/j0;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/b/b/k0;Ljava/lang/Object;ILe/f/b/b/j0;)Le/f/b/b/j0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/k0<",
            "TK;TV;>;TK;I",
            "Le/f/b/b/j0<",
            "TK;TV;>;)",
            "Le/f/b/b/j0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 11
    new-instance v0, Le/f/b/b/j0;

    invoke-static {p1}, Le/f/b/b/k0;->a(Le/f/b/b/k0;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3, p4}, Le/f/b/b/j0;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILe/f/b/b/j0;)V

    return-object v0
.end method

.method public a(Le/f/b/b/q;II)Le/f/b/b/k0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/q<",
            "TK;TV;",
            "Le/f/b/b/j0<",
            "TK;TV;>;",
            "Le/f/b/b/k0<",
            "TK;TV;>;>;II)",
            "Le/f/b/b/k0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 6
    new-instance v0, Le/f/b/b/k0;

    invoke-direct {v0, p1, p2, p3}, Le/f/b/b/k0;-><init>(Le/f/b/b/q;II)V

    return-object v0
.end method

.method public bridge synthetic a(Le/f/b/b/u;Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
    .locals 0

    .line 1
    check-cast p1, Le/f/b/b/k0;

    check-cast p2, Le/f/b/b/j0;

    check-cast p3, Le/f/b/b/j0;

    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/i0;->a(Le/f/b/b/k0;Le/f/b/b/j0;Le/f/b/b/j0;)Le/f/b/b/j0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Le/f/b/b/u;Ljava/lang/Object;ILe/f/b/b/r;)Le/f/b/b/r;
    .locals 0

    .line 2
    check-cast p1, Le/f/b/b/k0;

    check-cast p4, Le/f/b/b/j0;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/f/b/b/i0;->a(Le/f/b/b/k0;Ljava/lang/Object;ILe/f/b/b/j0;)Le/f/b/b/j0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Le/f/b/b/q;II)Le/f/b/b/u;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/i0;->a(Le/f/b/b/q;II)Le/f/b/b/k0;

    move-result-object p1

    return-object p1
.end method

.method public a()Le/f/b/b/x;
    .locals 1

    .line 5
    sget-object v0, Le/f/b/b/x;->c:Le/f/b/b/x;

    return-object v0
.end method

.method public a(Le/f/b/b/k0;Le/f/b/b/j0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/k0<",
            "TK;TV;>;",
            "Le/f/b/b/j0<",
            "TK;TV;>;TV;)V"
        }
    .end annotation

    .line 10
    invoke-static {p1}, Le/f/b/b/k0;->b(Le/f/b/b/k0;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Le/f/b/b/j0;->a(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method

.method public bridge synthetic a(Le/f/b/b/u;Le/f/b/b/r;Ljava/lang/Object;)V
    .locals 0

    .line 4
    check-cast p1, Le/f/b/b/k0;

    check-cast p2, Le/f/b/b/j0;

    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/i0;->a(Le/f/b/b/k0;Le/f/b/b/j0;Ljava/lang/Object;)V

    return-void
.end method
