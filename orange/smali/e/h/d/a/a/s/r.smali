.class public Le/h/d/a/a/s/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Le/h/d/a/a/s/q;


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/r;->a:Le/h/d/a/a/s/q;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/h/d/a/a/s/r;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/n;

    invoke-direct {v1, p1, p2}, Le/h/d/a/a/s/k0/n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
