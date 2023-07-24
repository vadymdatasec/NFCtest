.class public final synthetic Le/f/c/l/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/k/k;


# instance fields
.field public final a:Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;


# direct methods
.method public constructor <init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/c/l/b;->a:Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;

    return-void
.end method

.method public static a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)Le/f/c/k/k;
    .locals 1

    new-instance v0, Le/f/c/l/b;

    invoke-direct {v0, p0}, Le/f/c/l/b;-><init>(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;)V

    return-object v0
.end method


# virtual methods
.method public a(Le/f/c/k/f;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/f/c/l/b;->a:Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;

    invoke-static {v0, p1}, Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;->a(Lcom/google/firebase/crashlytics/CrashlyticsRegistrar;Le/f/c/k/f;)Le/f/c/l/d;

    move-result-object p1

    return-object p1
.end method
