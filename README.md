# OpenAds
OpenAds is an open-source project dedicated to enhancing transparency and trust in the advertising ecosystem. By making the entire advertising process, from bidding to serving, completely transparent, OpenAds empowers consumers to understand and control their ad experiences while helping businesses make informed, secure decisions about their ad investments.

Join us in building a more open, fair, and privacy-respecting advertising future.

## Risks to Users Online (Consumers)
Advertising networks run by companies like Google (Alphabet) and Facebook (Meta) are ----

https://en.wikipedia.org/wiki/Facebook%E2%80%93Cambridge_Analytica_data_scandal

## Risks to Advertisers
---

https://www.statista.com/statistics/677466/digital-ad-fraud-cost/

## Architecture

```mermaid
graph LR
subgraph Frontend
    A[Advertiser Interface]
    B[Host Interface]
    M[Consumer Devices]
end

subgraph Backend
    C[Ad Server]
    D[Ad Auction Engine]
    E[User Profile & Consent Management]
    F[Payment & Billing]
    G[Reporting & Analytics]
end

subgraph Datastore
    H[Ad Inventory Database]
    I[User Data & Preferences]
    J[Campaign Data & Performance]
    K[Billing & Transaction Data]
end

subgraph External
    L[Ad Host Websites/Apps]
end

A --> |Create & Manage Ads| C
B --> |Define Ad Slots| C
M --> |View & Interact| L
C --> |Trigger Auctions| D
D --> |Access Ad Inventory| H
D --> |Access User Data - with consent| I
D --> |Access Campaign Data| J
D --> |Serve Ads| L
E --> |Manage User Consent| I
M --> |Manage Preferences & Consent| E
A --> |View Reports| G
B --> |View Reports| G
G --> |Generate Reports| J
A --> |Make Payments| F
F --> |Process Payments| K
B --> |Receive Payouts| F
L --> |Display Ads| M
M --> |User Interaction| L
```
