.class public final Le/f/d/d0/x$b;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/d/d0/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Le/f/d/d0/x;


# direct methods
.method public constructor <init>(Le/f/d/d0/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/d/d0/x$b;->b:Le/f/d/d0/x;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le/f/d/d0/x;Le/f/d/d0/v;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Le/f/d/d0/x$b;-><init>(Le/f/d/d0/x;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$b;->b:Le/f/d/d0/x;

    invoke-virtual {v0}, Le/f/d/d0/x;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$b;->b:Le/f/d/d0/x;

    invoke-virtual {v0, p1}, Le/f/d/d0/x;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/d/d0/y;

    invoke-direct {v0, p0}, Le/f/d/d0/y;-><init>(Le/f/d/d0/x$b;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$b;->b:Le/f/d/d0/x;

    invoke-static {v0}, Le/f/d/d0/x;->b(Le/f/d/d0/x;)I

    move-result v0

    .line 2
    iget-object v1, p0, Le/f/d/d0/x$b;->b:Le/f/d/d0/x;

    invoke-virtual {v1, p1}, Le/f/d/d0/x;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object p1, p0, Le/f/d/d0/x$b;->b:Le/f/d/d0/x;

    invoke-static {p1}, Le/f/d/d0/x;->b(Le/f/d/d0/x;)I

    move-result p1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/d/d0/x$b;->b:Le/f/d/d0/x;

    invoke-static {v0}, Le/f/d/d0/x;->b(Le/f/d/d0/x;)I

    move-result v0

    return v0
.end method
