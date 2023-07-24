.class public final Le/f/b/b/y;
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
        "Le/f/b/b/z<",
        "TK;TV;>;",
        "Le/f/b/b/a0<",
        "TK;TV;>;>;"
    }
.end annotation


# static fields
.field public static final a:Le/f/b/b/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/y<",
            "**>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/b/b/y;

    invoke-direct {v0}, Le/f/b/b/y;-><init>()V

    sput-object v0, Le/f/b/b/y;->a:Le/f/b/b/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Le/f/b/b/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Le/f/b/b/y<",
            "TK;TV;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/b/b/y;->a:Le/f/b/b/y;

    return-object v0
.end method


# virtual methods
.method public a(Le/f/b/b/q;II)Le/f/b/b/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/q<",
            "TK;TV;",
            "Le/f/b/b/z<",
            "TK;TV;>;",
            "Le/f/b/b/a0<",
            "TK;TV;>;>;II)",
            "Le/f/b/b/a0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 6
    new-instance v0, Le/f/b/b/a0;

    invoke-direct {v0, p1, p2, p3}, Le/f/b/b/a0;-><init>(Le/f/b/b/q;II)V

    return-object v0
.end method

.method public bridge synthetic a(Le/f/b/b/u;Le/f/b/b/r;Le/f/b/b/r;)Le/f/b/b/r;
    .locals 0

    .line 1
    check-cast p1, Le/f/b/b/a0;

    check-cast p2, Le/f/b/b/z;

    check-cast p3, Le/f/b/b/z;

    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/y;->a(Le/f/b/b/a0;Le/f/b/b/z;Le/f/b/b/z;)Le/f/b/b/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Le/f/b/b/u;Ljava/lang/Object;ILe/f/b/b/r;)Le/f/b/b/r;
    .locals 0

    .line 2
    check-cast p1, Le/f/b/b/a0;

    check-cast p4, Le/f/b/b/z;

    invoke-virtual {p0, p1, p2, p3, p4}, Le/f/b/b/y;->a(Le/f/b/b/a0;Ljava/lang/Object;ILe/f/b/b/z;)Le/f/b/b/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Le/f/b/b/q;II)Le/f/b/b/u;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/y;->a(Le/f/b/b/q;II)Le/f/b/b/a0;

    move-result-object p1

    return-object p1
.end method

.method public a()Le/f/b/b/x;
    .locals 1

    .line 5
    sget-object v0, Le/f/b/b/x;->b:Le/f/b/b/x;

    return-object v0
.end method

.method public a(Le/f/b/b/a0;Le/f/b/b/z;Le/f/b/b/z;)Le/f/b/b/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/a0<",
            "TK;TV;>;",
            "Le/f/b/b/z<",
            "TK;TV;>;",
            "Le/f/b/b/z<",
            "TK;TV;>;)",
            "Le/f/b/b/z<",
            "TK;TV;>;"
        }
    .end annotation

    .line 7
    invoke-virtual {p2, p3}, Le/f/b/b/z;->a(Le/f/b/b/z;)Le/f/b/b/z;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/b/b/a0;Ljava/lang/Object;ILe/f/b/b/z;)Le/f/b/b/z;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/a0<",
            "TK;TV;>;TK;I",
            "Le/f/b/b/z<",
            "TK;TV;>;)",
            "Le/f/b/b/z<",
            "TK;TV;>;"
        }
    .end annotation

    .line 9
    new-instance p1, Le/f/b/b/z;

    invoke-direct {p1, p2, p3, p4}, Le/f/b/b/z;-><init>(Ljava/lang/Object;ILe/f/b/b/z;)V

    return-object p1
.end method

.method public a(Le/f/b/b/a0;Le/f/b/b/z;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/a0<",
            "TK;TV;>;",
            "Le/f/b/b/z<",
            "TK;TV;>;TV;)V"
        }
    .end annotation

    .line 8
    invoke-virtual {p2, p3}, Le/f/b/b/z;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic a(Le/f/b/b/u;Le/f/b/b/r;Ljava/lang/Object;)V
    .locals 0

    .line 4
    check-cast p1, Le/f/b/b/a0;

    check-cast p2, Le/f/b/b/z;

    invoke-virtual {p0, p1, p2, p3}, Le/f/b/b/y;->a(Le/f/b/b/a0;Le/f/b/b/z;Ljava/lang/Object;)V

    return-void
.end method
