.class public final synthetic Le/f/c/k/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Ljava/util/Map$Entry;

.field public final c:Le/f/c/o/a;


# direct methods
.method public constructor <init>(Ljava/util/Map$Entry;Le/f/c/o/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/k/v;->b:Ljava/util/Map$Entry;

    iput-object p2, p0, Le/f/c/k/v;->c:Le/f/c/o/a;

    return-void
.end method

.method public static a(Ljava/util/Map$Entry;Le/f/c/o/a;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Le/f/c/k/v;

    invoke-direct {v0, p0, p1}, Le/f/c/k/v;-><init>(Ljava/util/Map$Entry;Le/f/c/o/a;)V

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Le/f/c/k/v;->b:Ljava/util/Map$Entry;

    iget-object v1, p0, Le/f/c/k/v;->c:Le/f/c/o/a;

    invoke-static {v0, v1}, Le/f/c/k/w;->a(Ljava/util/Map$Entry;Le/f/c/o/a;)V

    return-void
.end method
