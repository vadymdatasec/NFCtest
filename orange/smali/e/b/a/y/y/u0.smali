.class public Le/b/a/y/y/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "B:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/e0/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/e0/o<",
            "Le/b/a/y/y/t0<",
            "TA;>;TB;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/y/s0;

    invoke-direct {v0, p0, p1, p2}, Le/b/a/y/y/s0;-><init>(Le/b/a/y/y/u0;J)V

    iput-object v0, p0, Le/b/a/y/y/u0;->a:Le/b/a/e0/o;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;II)TB;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2, p3}, Le/b/a/y/y/t0;->b(Ljava/lang/Object;II)Le/b/a/y/y/t0;

    move-result-object p1

    .line 2
    iget-object p2, p0, Le/b/a/y/y/u0;->a:Le/b/a/e0/o;

    invoke-virtual {p2, p1}, Le/b/a/e0/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 3
    invoke-virtual {p1}, Le/b/a/y/y/t0;->a()V

    return-object p2
.end method

.method public a(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;IITB;)V"
        }
    .end annotation

    .line 4
    invoke-static {p1, p2, p3}, Le/b/a/y/y/t0;->b(Ljava/lang/Object;II)Le/b/a/y/y/t0;

    move-result-object p1

    .line 5
    iget-object p2, p0, Le/b/a/y/y/u0;->a:Le/b/a/e0/o;

    invoke-virtual {p2, p1, p4}, Le/b/a/e0/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
