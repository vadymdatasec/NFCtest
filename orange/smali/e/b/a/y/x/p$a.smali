.class public final Le/b/a/y/x/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/b/a/y/x/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/x/v<",
        "TZ;>;"
    }
.end annotation


# instance fields
.field public final a:Le/b/a/y/a;

.field public final synthetic b:Le/b/a/y/x/p;


# direct methods
.method public constructor <init>(Le/b/a/y/x/p;Le/b/a/y/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/x/p$a;->b:Le/b/a/y/x/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/b/a/y/x/p$a;->a:Le/b/a/y/a;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/x/y0;)Le/b/a/y/x/y0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "TZ;>;)",
            "Le/b/a/y/x/y0<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/p$a;->b:Le/b/a/y/x/p;

    iget-object v1, p0, Le/b/a/y/x/p$a;->a:Le/b/a/y/a;

    invoke-virtual {v0, v1, p1}, Le/b/a/y/x/p;->a(Le/b/a/y/a;Le/b/a/y/x/y0;)Le/b/a/y/x/y0;

    move-result-object p1

    return-object p1
.end method
