.class public final Le/f/b/b/f0;
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
        "Le/f/b/b/g0<",
        "TK;TV;>;",
        "Le/f/b/b/h0<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final a:Le/f/b/b/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/f0<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/b/b/f0;

    invoke-direct {v0}, Le/f/b/b/f0;-><init>()V

    sput-object v0, Le/f/b/b/f0;->a:Le/f/b/b/f0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Le/f/b/b/f0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Le/f/b/b/f0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/b/b/f0;->a:Le/f/b/b/f0;

    return-object v0
.end method


# virtual methods
.method public a(Le/f/b/b/h0;Le/f/b/b/g0;Le/f/b/b/g0;)Le/f/b/b/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/h0<",
            "TK;TV;>;",
            "Le/f/b/b/g0<",
            "TK;TV;>;",
            "Le/f/b/b/g0<",
            "TK;TV;>;)",
            "Le/f/b/b/g0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 7
    invoke-virtual {p2}, Le/f/b/b/o;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 8
    :cond_0
    invoke-static {p1}, Le/f/b/b/h0;->a(Le/f/b/b/h0;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Le/f/b/b/g0;->a(Ljava/lang/ref/ReferenceQueue;Le/f/b/b/g0;)Le/f/b/b/g0;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/b/b/h0;Ljava/lang/Object;ILe/f/b/b/g0;)Le/f/b/b/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/h0<",
            "TK;TV;>;TK;I",
            "Le/f/b/b/g0<",
            "TK;TV;>;)",
            "Le/f/b/b/g0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 10
    new-instance v0, Le/f/b/b/g0;

    invoke-static {p1}, Le/f/b/b/h0;->a(Le/f/b/b/h0;)Ljava/lang/ref/ReferenceQueue;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3, p4}, Le/f/b/b/g0;-><init>(Ljava/lang/ref/ReferenceQueue;Ljava/lang/Object;ILe/f/b/b/g0;)V

    return-object v0
.end method

.method public a(Le/f/b/b/q;II)Le/f/b/b/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/q<",
            "TK;TV;",
            "Le/f/b/b/g0<",
            "TK;TV;>;",
            "Le/f/b/b/h0<",
            "TK;TV;>;>;II)",
            "Le/f/b/b/h0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 6
    new-instance v0, Le/f/b/b/h0;

    invoke-direct {v0, p1, p2, p3}, Le/f/b/b/h0;-><init>(Le/f/b/b/q;II)V

    return-object v0
.end method

.method public bridge synthetic a(Le/f/b/b/u;Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
    .locals 0

    .line 1
    check-cast p1, Le/f/b/b/h0;

    check-cast p2, Le/f/b/b/g0;

    check-cast p3, Le/f/b/b/g0;

    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/f0;->a(Le/f/b/b/h0;Le/f/b/b/g0;Le/f/b/b/g0;)Le/f/b/b/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Le/f/b/b/u;Ljava/lang/Object;ILe/f/b/b/r;)Le/f/b/b/r;
    .locals 0

    .line 2
    check-cast p1, Le/f/b/b/h0;

    check-cast p4, Le/f/b/b/g0;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/f/b/b/f0;->a(Le/f/b/b/h0;Ljava/lang/Object;ILe/f/b/b/g0;)Le/f/b/b/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Le/f/b/b/q;II)Le/f/b/b/u;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/f0;->a(Le/f/b/b/q;II)Le/f/b/b/h0;

    move-result-object p1

    return-object p1
.end method

.method public a()Le/f/b/b/x;
    .locals 1

    .line 5
    sget-object v0, Le/f/b/b/x;->b:Le/f/b/b/x;

    return-object v0
.end method

.method public a(Le/f/b/b/h0;Le/f/b/b/g0;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/h0<",
            "TK;TV;>;",
            "Le/f/b/b/g0<",
            "TK;TV;>;TV;)V"
        }
    .end annotation

    .line 9
    invoke-virtual {p2, p3}, Le/f/b/b/g0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic a(Le/f/b/b/u;Le/f/b/b/r;Ljava/lang/Object;)V
    .locals 0

    .line 4
    check-cast p1, Le/f/b/b/h0;

    check-cast p2, Le/f/b/b/g0;

    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/f0;->a(Le/f/b/b/h0;Le/f/b/b/g0;Ljava/lang/Object;)V

    return-void
.end method
