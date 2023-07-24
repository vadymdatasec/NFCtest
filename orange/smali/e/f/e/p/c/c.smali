.class public final Le/f/e/p/c/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/util/Comparator<",
        "Le/f/e/p/c/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le/f/e/p/c/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Le/f/e/p/c/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/e/p/c/b;Le/f/e/p/c/b;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Le/f/e/p/c/b;->c()I

    move-result p1

    invoke-virtual {p2}, Le/f/e/p/c/b;->c()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Le/f/e/p/c/b;

    check-cast p2, Le/f/e/p/c/b;

    invoke-virtual {p0, p1, p2}, Le/f/e/p/c/c;->a(Le/f/e/p/c/b;Le/f/e/p/c/b;)I

    move-result p1

    return p1
.end method
