.class public Le/f/d/d0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/d/d0/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/d/d0/s<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/f/d/r;

.field public final synthetic b:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Le/f/d/d0/n;Le/f/d/r;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    iput-object p2, p0, Le/f/d/d0/f;->a:Le/f/d/r;

    iput-object p3, p0, Le/f/d/d0/f;->b:Ljava/lang/reflect/Type;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/f;->a:Le/f/d/r;

    iget-object v1, p0, Le/f/d/d0/f;->b:Ljava/lang/reflect/Type;

    invoke-interface {v0, v1}, Le/f/d/r;->a(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
